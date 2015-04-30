package de.tu_berlin.ise.muse.analyzer.importer.impl;

import de.tu_berlin.ise.muse.analyzer.ResourceRegistry;
import de.tu_berlin.ise.muse.analyzer.enums.resources.EnumResourceType;
import de.tu_berlin.ise.muse.analyzer.enums.resources.aws.AwsDeviceResourceName;
import de.tu_berlin.ise.muse.analyzer.enums.resources.aws.AwsInstanceResourceName;
import de.tu_berlin.ise.muse.analyzer.importer.InterfaceResourceImporter;
import de.tu_berlin.ise.muse.analyzer.model.Resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ResourceImporter implements InterfaceResourceImporter {

	private static JSONArray json;
	private static ResourceRegistry registry;
	private final String filepath;

	public ResourceImporter(String filepath) {
		super();
		this.filepath = filepath;
	}

	private static void importLocalJson(String filepath) throws IOException,
			ParseException {
		JSONParser parser = new JSONParser();
		json = (JSONArray) parser.parse(new InputStreamReader(
				ResourceImporter.class.getResourceAsStream(filepath)));
	};

	private void importInstanceResource(JSONObject o) {
		Resource r;
		AwsInstanceResourceName name;
		if (o.get("id") != null && o.get("provider") != null
				&& o.get("name") != null) {
			for (AwsInstanceResourceName n : AwsInstanceResourceName.values()) {
				if (n.name().equals(
						((String) o.get("type")).toUpperCase()
								.replace(".", "_"))) {
					name = AwsInstanceResourceName.valueOf(((String) o
							.get("type")).toUpperCase().replace(".", "_"));
					r = new Resource((String) o.get("id"), name,
							(String) o.get("provider"),
							EnumResourceType.INSTANCE);
					registry.addResource(r);
				}
			}
			if (o.get("resources") != null) {
				importResource((JSONObject) o.get("resources"));
			}
		}
	}

	private void importDeviceResource(JSONObject o) {
		Resource r;
		AwsDeviceResourceName name;
		if (o.get("id") != null && o.get("provider") != null
				&& o.get("name") != null) {
			for (AwsDeviceResourceName n : AwsDeviceResourceName.values()) {
				if (n.name().equals(
						((String) o.get("type")).toUpperCase())) {
					name = AwsDeviceResourceName.valueOf(((String) o
							.get("type")).toUpperCase());
					r = new Resource((String) o.get("id"), name,
							(String) o.get("provider"),
							EnumResourceType.DEVICE);
					registry.addResource(r);
				}
			}
			if (o.get("resources") != null) {
				importResource((JSONObject) o.get("resources"));
			}
		}
	}

	private void importNetworkResource(JSONObject o) {

	}

	private void importResource(JSONObject o) {

		if (o.get("type") != null) {
			switch (EnumResourceType.valueOf(((String) o.get("type"))
					.toUpperCase())) {
			case INSTANCE:
				importInstanceResource(o);
				break;
			case DEVICE:
				importDeviceResource(o);
				break;
			case NETWORK:
				importNetworkResource(o);
				break;
			default:
				break;
			}
		}

	}

	public void importToRegistry() {
		try {
			importLocalJson(filepath);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Object o : json) {
			importResource((JSONObject) o);
		}
	}

	public static void main(String[] args) {

		try {
			importLocalJson("/clusterA.json");
			
			for (Object o : json) {
				String name = (String) ((JSONObject) o).get("name");
				String id = (String) ((JSONObject) o).get("id");
				String type = (String) ((JSONObject) o).get("type");
				System.out.println(name + ", " + id + ", " + type);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

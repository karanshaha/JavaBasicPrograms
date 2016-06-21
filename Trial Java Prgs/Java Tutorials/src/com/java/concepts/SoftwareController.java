package com.java.concepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SoftwareController {

	public static void main(String s[]) throws IOException {
		SoftwareController softwareControllerObj = new SoftwareController();
		String inputData = softwareControllerObj.readFile("input.txt");
		List<ServerData> serverDataList = softwareControllerObj.parseAndExtractPoints(inputData);
		List<String> finalLowVersionList = softwareControllerObj.processingServerDataToFindLowestVersion(serverDataList);
		softwareControllerObj.writeFile("output.txt",finalLowVersionList);
		
	}
	
	public void writeFile(String FileName,List<String> finalLowVersionList) throws IOException{
		BufferedWriter br = new BufferedWriter(new FileWriter("src/"+FileName));
		for (String serverName : finalLowVersionList) {

			br.write(serverName + "\n");
		}
		br.close();
	}
	

	public String readFile(String filename) throws FileNotFoundException, IOException {
		String inputData = "";
		BufferedReader br = new BufferedReader(new FileReader("src/"+filename));
		/*SoftwareController softwareControllerObj = new SoftwareController();*/
		try {
			StringBuilder sb = new StringBuilder();
			String line = null;
			line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			inputData = sb.toString();
			//this.parseAndExtractPoints(inputData);
		} finally {
			br.close();
		}
		return inputData;
	}

	/**
	 * This method parses the raw data read from file and puts into ServerData
	 * 
	 * @param data
	 * @throws IOException
	 */
	public List<ServerData> parseAndExtractPoints(String data) throws IOException {
		String dataArr[] = data.split("\\n");
		List<ServerData> serverDataList = new ArrayList<ServerData>();
		for (int i = 0; i < dataArr.length; i++) {
			String element[] = dataArr[i].split(",");
			ServerData serverData = new ServerData();

			serverData.setServerName(element[0]);
			serverData.setSoftwareType(element[1]);
			serverData.setSoftwareName(element[2]);
			serverData.setSoftwareVersion(element[3]);

			serverDataList.add(serverData);

		}
		return serverDataList;
		//ArrayList<String> finalList = processingServerDataToFindLowestVersion(serverDataList);
		

	}

	/**
	 * This method is used to iterate over list of ServerData and put specific
	 * data related to specific software in Map which has List of ServerData and
	 * then sorts it to get the lowest version of specific software.
	 * 
	 * @param serverDataList
	 * @return
	 */
	public ArrayList<String> processingServerDataToFindLowestVersion(
			List<ServerData> serverDataList) {
		Map<String, List<ServerData>> serverNameDetailMap = new HashMap<String, List<ServerData>>();
		List<ServerData> sfTypeData = null;
		for (ServerData serverData : serverDataList) {

			if (serverNameDetailMap.isEmpty()) {
				sfTypeData = new ArrayList<ServerData>();
				sfTypeData.add(serverData);
				serverNameDetailMap.put(serverData.getSoftwareName(),
						sfTypeData);
			} else {
				List<ServerData> list = serverNameDetailMap.get(serverData
						.getSoftwareName());
				if (list != null) {
					list.add(serverData);
				} else {
					sfTypeData = new ArrayList<ServerData>();
					sfTypeData.add(serverData);
					serverNameDetailMap.put(serverData.getSoftwareName(),
							sfTypeData);
				}

			}
		}

		Set<String> keySet = serverNameDetailMap.keySet();
		ArrayList<String> finalList = new ArrayList<String>();
		for (String sfName : keySet) {
			List<ServerData> list = serverNameDetailMap.get(sfName);
			if (!list.isEmpty() && list.size() > 1) {
				Collections.sort(list, new ServerDataComparator());
				String assumeLowest = list.get(0).getSoftwareVersion();
				for (int i = 0; i < list.size(); i++) {
					ServerData data = list.get(i);
					if (data.getSoftwareVersion().equals(assumeLowest)) {
						finalList.add(data.getServerName());
					}
				}

			}

		}
		return finalList;
	}
}

class ServerData {

	String serverName;
	String softwareType;
	String softwareName;
	String softwareVersion;

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getSoftwareType() {
		return softwareType;
	}

	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

}

class ServerDataComparator implements Comparator<ServerData> {

	@Override
	public int compare(ServerData o1, ServerData o2) {

		String softwareVersionStr1 = o1.getSoftwareVersion();
		String softwareVersionStr2 = o2.getSoftwareVersion();
		int compVal = softwareVersionStr1.compareTo(softwareVersionStr2);
		return compVal;

	}

}

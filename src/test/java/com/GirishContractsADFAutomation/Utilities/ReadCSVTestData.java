package com.GirishContractsADFAutomation.Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class ReadCSVTestData {
	
	public String tagvalue = null;
	public String csvtag = null;
	
	public static HashMap<String, String> hashampcsv = new HashMap<String, String>(); 
	
	/**
	 * @author ginallap
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	public  HashMap<String, String> loadcsv(String FilePath) throws IOException {

		String[] Values=null;
		if(FilePath==null || FilePath.isEmpty())
			FilePath=System.getProperty("user.dir")+"\\TestData\\OKClogin.csv";
		BufferedReader br = new BufferedReader( new FileReader(FilePath));
		String strLine = "";
		while( (strLine = br.readLine()) != null ){
		Values =  strLine.split(",");
		System.out.println(Values[0]);
		System.out.println(Values[1]);
		if (Values.length>1)
		hashampcsv.put(Values[0],Values[1]);
		}
		br.close();
		return hashampcsv;

	}

	/**
	 * @author ginallap
	 * @return
	 * @throws Exception
	 */

	public String GetValuefromParamList(String ParamStringReference,String FldName) {
		String csvvalue="";
		String LHS;
		String tempy="";
		String extn=null;
		String stringmethod=getTestData(ParamStringReference);
		String[] Params  = stringmethod.split(";");
		for(int i=0 ;i<Params.length; i++){
			if (Params[i].contains("=")) {
				String[] LHSRHS = Params[i].split("=");
				LHS = LHSRHS[0];
				if (LHS.equalsIgnoreCase(FldName)){
					tempy = LHSRHS[1];

					if (tempy.contains("\"")) {
						tempy = tempy.replace("\"", "");
						csvvalue = tempy;
					} else

						csvvalue = getTestData(FldName);

				}
			}

			else if ( Params[i].contains("->") ) {
				String[] LHSRHS = Params[i].split("->");
				LHS = LHSRHS[0];
				if (LHS.equalsIgnoreCase(FldName)) {
					csvtag = LHSRHS[1];
					csvvalue = getTestData(csvtag);

				}	
			}

		}
		return csvvalue;
	}
	public String getTestData(String tag){
		
		tagvalue="";
		    System.out.println("hashmap:"+hashampcsv);
			Set<String> keySet= hashampcsv.keySet();
			for(Object key:keySet)
			{
				if (key.equals(tag)){
				 String temp=hashampcsv.get(key).toString();
				 if (temp.contains("~"))
					 tagvalue=temp.replace("~", ",");
				 else
					 tagvalue= temp;
		
	           }
			}
	      
			return tagvalue;

	}
}

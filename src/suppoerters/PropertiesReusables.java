package suppoerters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReusables

{
	private String filePath;
	private FileInputStream fip;
	private Properties properties;
	public PropertiesReusables(String filepath) throws IOException
	
	{
		
		this.filePath=filepath;
		fip = new FileInputStream(filePath);
		properties=new Properties();
		properties.load(fip);	
		
		
	}
	
	public String getPropertyValue(String key)
	{
		String value=null;
		if (properties!=null) {
			value = properties.getProperty(key);	
		}
		return value;
	}
	
	
	public String getPropertyValue(String key,String defaultvalue)
	{
		String value=null;
		if (properties!=null) 
		{
			value = properties.getProperty(key);	
			
			
			if(value==null)
			
			{
				value = defaultvalue;
		     }
		
	   }
    return value;
	
	
	}
	
	public void setPropertyEntry(String key,String value) throws IOException
	{
		if (properties!=null) {
			properties.setProperty(key, value);
			FileOutputStream fop = new FileOutputStream(filePath);
			properties.store(fop, "Succesfully saved the data");
		}
	}
	
	
	
	public void removeEntry(String key) throws IOException
	
	{
		
		if(properties!=null)
			
		{
			properties.remove(key);
			FileOutputStream fop=new FileOutputStream(filePath);
			properties.store(fop, "Succesfully saved the data");
			
			
		}
	
}
	
public Map<String,String> getAllpropertiesdata()

{
	
	Map<String,String> m1=new HashMap<>();

	if(properties!=null)
	{
		Set<Object>key=properties.keySet();
		
		for(Object keyvalue:key)
	
		{	
		
			String actualkey=(String)keyvalue;
			String vaule= properties.getProperty(actualkey);
			m1.put(actualkey, vaule);
		
	    }
    }
  return m1;
}


}







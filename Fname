
public class Fname {

	protected String filepath;
	protected char pathseparator = '\\';
	protected char extension = '.';
	
	Fname(String str)
	{
		filepath = str;	
	}

	public String extension()
	{
		int dot = filepath.lastIndexOf(extension);
		if(dot == -1){
			return null;
		}
		return filepath.substring(dot + 1);
	}
	
	public String fname()
	{
		int dot = filepath.lastIndexOf(extension);
		int sep = filepath.lastIndexOf(pathseparator);
		if(dot == -1 || sep == -1)
		{
			return null;
		}
		return filepath.substring(sep + 1, dot);
	
	}
	
	public String fpath()
	{
		int sep = filepath.lastIndexOf(pathseparator);
		if(sep == -1)
		{
		return null;
		}
		return filepath.substring(0, sep);
	}
	
}

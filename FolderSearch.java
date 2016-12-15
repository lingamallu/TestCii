import java.io.File;

public class FolderSearch {

	public void listFilesandSubDirectoryFiles(String DirectoryName)
	{
		
		File file = new File(DirectoryName);
		File[] filelist= file.listFiles();
		for(File pathname:filelist)
		{
			if(pathname.isFile())
			{
				String Fpath = pathname.getAbsolutePath();
				System.out.println(Fpath);
			}
			else if(pathname.isDirectory())
			{
				listFilesandSubDirectoryFiles(pathname.getAbsolutePath());
			}
		
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FolderSearch fs = new FolderSearch();
      final String DirectoryName = "D:/New folder/Satya/Satya_WorkStation/My_Desktop/HomeWork/src";
      fs.listFilesandSubDirectoryFiles(DirectoryName);
	}

}

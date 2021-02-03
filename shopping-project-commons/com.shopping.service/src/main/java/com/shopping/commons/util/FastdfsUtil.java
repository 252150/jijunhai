package com.shopping.commons.util;

import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.util.ResourceUtils;

public class FastdfsUtil {
    static {
    	try {
    		String CONF_FILENAME=ResourceUtils.getURL("classpath:").getPath()+"fdfs_client.conf";
    		ClientGlobal.init(CONF_FILENAME);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    /**
     * 上传文件
     * @param file
     * @param exName 扩展名
     * @return
     */
    public static String upload(byte[] file,String exName) {
    	

		try {
			StorageClient storageClient = null;
			try {
				TrackerClient tracker=new TrackerClient();
				TrackerServer trackerServer = tracker.getConnection();
				StorageServer storageServer=null;
				storageClient = new StorageClient(trackerServer,storageServer);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	    	String fileIds[]=storageClient.upload_file(file, exName, null);
	    	System.out.println(fileIds.length);
	    	System.out.println("组名"+fileIds[0]);
	    	System.out.println("路径"+fileIds[1]);
	    	System.out.println("/"+fileIds[0]+"/"+fileIds[1]);
	    	return "/"+fileIds[0]+"/"+fileIds[1];
	    	
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
    
    }
    /**
     * 下载文件
     * @param groupName
     * @param fileName
     * @return
     */
    public static byte[] download(String groupName,String fileName) {
    	try {
			TrackerClient tracker=new TrackerClient();
			TrackerServer trackerServer = tracker.getConnection();
			StorageServer storageServer=null;
			StorageClient storageClient=new StorageClient(trackerServer,storageServer);
			
			byte[] b=storageClient.download_file(groupName, fileName);
			return b;
    	}catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    }
    /**
     * 删除文件
     * @param groupname
     * @param fileName
     */
    public static void delete(String groupname,String fileName) {
     try {
     	TrackerClient tracker=new TrackerClient();
 		TrackerServer trackerServer = tracker.getConnection();
 		StorageServer storageServer=null;
 		StorageClient storageClient=new StorageClient(trackerServer,storageServer);
 		int i=storageClient.delete_file(groupname, fileName);
 		System.out.print(i==0?"删除成功":"删除失败"+i);
     }catch(Exception e){
    	 e.printStackTrace();
    	 throw new RuntimeException("删除异常"+e.getMessage());
     }
    }
}

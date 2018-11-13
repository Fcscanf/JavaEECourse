package cn.fcsca.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * UploadAction
 *
 * @author Fcscanf
 * @description
 * @date 上午 8:39 2018-11-13
 */
@Data
public class UploadMoreFileAction extends ActionSupport {

    private List<File> upload;
    private List<String> uploadFileName;

    @Override
    public String execute() throws Exception {
        if (upload != null) {
            for (int i = 0; i < upload.size(); i++) {
                InputStream inputStream = new FileInputStream(upload.get(i));
                OutputStream outputStream = new FileOutputStream("D:\\fcofficework\\DNS"+getUploadFileName().get(i));
                byte buffer[] = new byte[1024];
                int count = 0;
                while ((count = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer,0,count);
                }
                outputStream.close();
                inputStream.close();
            }
        }
        return SUCCESS;
    }
}

package cn.fcsca.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * UploadAction
 *
 * @author Fcscanf
 * @description
 * @date 上午 8:39 2018-11-13
 */
@Data
public class UploadAction extends ActionSupport {

    private File upload;
    private String uploadFileName;

    @Override
    public String execute() throws Exception {
        InputStream inputStream = new FileInputStream(getUpload());
        OutputStream outputStream = new FileOutputStream("D:\\fcofficework\\DNS"+uploadFileName);
        byte buffer[] = new byte[1024];
        int count = 0;
        while ((count = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer,0,count);
        }
        outputStream.close();
        inputStream.close();
        return SUCCESS;
    }
}

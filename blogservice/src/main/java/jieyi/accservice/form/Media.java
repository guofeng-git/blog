package jieyi.accservice.form;
import java.io.Serializable;

import org.apache.ibatis.type.Alias;
/**
 * */
@Alias("media")
public class Media  implements Serializable {
	//userid	length:100
	private String userid;
	//url	length:255
	private String url;
	//image_name	length:255
	private String imageName;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
}

Avtar Singh


package in.gov.uidai.impl.dataportal.enrl_search_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BankMapperResponse", namespace="")
public class BankMapperResponse {

	@XmlElement(name="statusCode")
    private int statusCode;
	
	@XmlElement(name="statusDescription")
	private String statusDescription;
	
	@XmlElement(name="uid")
	private String uid;
	
	@XmlElement(name="bank_id")
	private String bank_id;
	
	@XmlElement(name="mod_status")
	private String mod_status;
	
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	
	public String getMod_status() {
		return mod_status;
	}
	public void setMod_status(String mod_status) {
		this.mod_status = mod_status;
	}
	
}

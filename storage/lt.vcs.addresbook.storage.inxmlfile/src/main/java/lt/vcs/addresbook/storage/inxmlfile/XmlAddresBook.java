package lt.vcs.addresbook.storage.inxmlfile;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addresBook")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlAddresBook {
	
	@XmlElement(name="addres")
	private List<XmlAddresEntry> addreses = new ArrayList<XmlAddresEntry>();

	public List<XmlAddresEntry> getAddreses() {
		return addreses;
	}
	
	public void setAddreses(List<XmlAddresEntry> addreses) {
		this.addreses = addreses;
	}
}

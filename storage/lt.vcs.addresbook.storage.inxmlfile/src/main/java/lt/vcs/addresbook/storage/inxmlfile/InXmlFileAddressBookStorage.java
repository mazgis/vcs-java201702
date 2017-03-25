package lt.vcs.addresbook.storage.inxmlfile;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import lt.vcs.addresbook.storage.inmemory.InMemoryAddressBook;
import lt.vcs.addressbook.api.IAddresEntry;

public class InXmlFileAddressBookStorage extends InMemoryAddressBook{

	private String file;
	
	public InXmlFileAddressBookStorage(String file) throws JAXBException {
		list=loadFromFile(file);
		this.file=file;
	}
	
	@Override
	public void save(IAddresEntry entry) throws Exception {
		super.save(entry);
		saveToFile(file);
	}
	
	private List<IAddresEntry> loadFromFile(String file) throws JAXBException{
		JAXBContext context = JAXBContext.newInstance(XmlAddresBook.class);
		Unmarshaller un = context.createUnmarshaller();
		XmlAddresBook addbook = (XmlAddresBook) un.unmarshal(new File(file));
		return addbook.getAddreses();

	}
	
	private void saveToFile(String file) throws JAXBException{
		JAXBContext context = JAXBContext.newInstance(XmlAddresBook.class);
		Marshaller ma = context.createMarshaller();
		XmlAddresBook addbook = new XmlAddresBook();
		addbook.setAddreses(list);
		ma.marshal(addbook,new File(file));

	}
		
	
	
}

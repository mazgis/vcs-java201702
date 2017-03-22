package lt.vcs.addressbook.api;

import java.util.List;

public interface IAddresBookStorage {
	public void save(IAddresEntry entry);

	public List<IAddresEntry> getAllEntries();

	public List<IAddresEntry> findEntriesByName(String name);

	public List<IAddresEntry> findEntriesByEmail(String email);
}

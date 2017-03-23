package lt.vcs.addressbook.api;

import java.util.Collection;

public interface IAddresBookStorage {
	public void save(IAddresEntry entry);

	public Collection<IAddresEntry> getAllEntries();

	public Collection<IAddresEntry> findEntriesByName(String name);

	public Collection<IAddresEntry> findEntriesByEmail(String email);
}

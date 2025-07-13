package lk.cpa.intern.test.service;

import lk.cpa.intern.test.to.ContactTO;
import lk.cpa.intern.test.type.ContactResponse;

import java.util.List;

public interface ContactService {
    ContactResponse saveContact(ContactTO contactTO);
void deleteContact(Long id);

ContactResponse updateContact(ContactTO contactTO,Long contactID);
List<ContactResponse> getContacts(Long userID);

}

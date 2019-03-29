package stefan.framework.sfgpetclinic.services;

import stefan.framework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

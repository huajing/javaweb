package c.c.k.mapper;

import c.c.k.domain.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AddressMapper {
    @Insert({"insert into t_address(id, name) values (#{id}, #{name})"})
    public void saveAddress(Address address);

    @Select({"select * from t_address order by id desc"})
    public List<Address> listAddress();

    @Select({"select count(*) from t_address"})
    public int countAddress();
}

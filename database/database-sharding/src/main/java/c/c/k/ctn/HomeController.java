package c.c.k.ctn;

import c.c.k.domain.Address;
import c.c.k.mapper.AddressMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class HomeController {
    @Resource
    private AddressMapper addressMapper;

    @GetMapping("/saveAddrss")
    public String saveAddrss(){
        Address address = new Address();
        long id = Math.abs(new Random().nextInt(1000));
        address.setId(id);
        address.setName(id + "-name");
        addressMapper.saveAddress(address);
        return "success";
    }

    @GetMapping("/listAddress")
    public String listAddress(){
        List<Address> addresses = addressMapper.listAddress();


        return addresses.parallelStream().map(a->a.getId()+"").collect(Collectors.joining(","));
    }

    @GetMapping("/countAddress")
    public int countAddress(){
        return addressMapper.countAddress();
    }
}

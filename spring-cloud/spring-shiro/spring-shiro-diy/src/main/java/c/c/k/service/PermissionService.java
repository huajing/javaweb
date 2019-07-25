package c.c.k.service;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @Title c.c.k.service
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/24 chenck
 */
@Component
public class PermissionService {
    public Set<String> listPermission(int userI){
        Set<String> set = new HashSet<>();
        set.add("permission1");
        return set;
    }
}

## 参考文档
https://segmentfault.com/a/1190000014479154

按上面的地址做完之前，发现不走验证的功能CustomRealm的doGetAuthorizationInfo，doGetAuthenticationInfo，因为没有触发登录
```
@RequestMapping(value = "/baseLogin", method = RequestMethod.POST)
@ResponseBody
public Map<String, Object> baseLogin(HttpServletRequest request, String personId, String password) throws ShowException {

    UsernamePasswordToken token = new UsernamePasswordToken(personId, password);
    Subject currentUser = SecurityUtils.getSubject();
    try {
        currentUser.login(token);
    } catch (UnknownAccountException uae) {
        getShowException("用户名和密码不匹配");
    } catch (IncorrectCredentialsException ice) {
        getShowException("用户名和密码不匹配");
    } catch (LockedAccountException lae) {
        log.info("LockedAccountException");
    } catch (ExcessiveAttemptsException eae) {
        log.info("ExcessiveAttemptsException");
    } catch (AuthenticationException ae) {
        log.info("AuthenticationException");
    }

    return ISSUCCESS;
}
```
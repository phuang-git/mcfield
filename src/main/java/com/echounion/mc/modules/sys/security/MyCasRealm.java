package com.echounion.mc.modules.sys.security;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by phuang on 2016/2/5.
 */
public class MyCasRealm extends CasRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String)principalCollection.getPrimaryPrincipal();

        return null;
    }
}

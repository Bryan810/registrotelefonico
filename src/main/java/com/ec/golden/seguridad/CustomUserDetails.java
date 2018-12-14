package com.ec.golden.seguridad;

import com.ec.golden.entidades.usuarios.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails extends Usuario implements UserDetails {

    private static final long serialVersionUID = 1L;

    private List<GrantedAuthority> authorities;

    CustomUserDetails(Usuario user) {
        super(user);
        List<String> userRoles = new ArrayList<>();
        userRoles.add("ROLE_USER");
        String permisos = StringUtils.collectionToCommaDelimitedString(userRoles);
        authorities = AuthorityUtils.commaSeparatedStringToAuthorityList(permisos);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }


    /**
     * Returns the password used to authenticate the user.
     *
     * @return the password
     */
    @Override
    public String getPassword() {
        return getPassword();
    }


    @Override
    public String getUsername() {
        return getUsername();
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }


    @Override
    public boolean isAccountNonLocked() {
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    @Override
    public boolean isEnabled() {
        return true;
    }
}

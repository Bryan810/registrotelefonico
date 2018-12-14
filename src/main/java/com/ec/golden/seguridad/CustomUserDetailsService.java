package com.ec.golden.seguridad;

import com.ec.golden.entidades.usuarios.Usuario;
import com.ec.golden.repositorios.UsuarioRepo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioRepo usuarios;

    private final Log log = LogFactory.getLog(getClass());

    @Autowired
    public CustomUserDetailsService(UsuarioRepo usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public UserDetails loadUserByUsername(String cltCi) throws UsernameNotFoundException {
        Usuario clt = usuarios.findByIdUsuario(cltCi);
        if (null == clt) {
            log.debug("No user present with username: " + cltCi);
            throw new UsernameNotFoundException("No user present with username: " + cltCi);
        } else {
            return new CustomUserDetails(clt);
        }
    }
}

package com.jogo.hanoi.Security;

import com.jogo.hanoi.Entity.Usuario;
import com.jogo.hanoi.Repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UsuarioRepository usuariorepository;

    public UserDetailsServiceImpl(UsuarioRepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Usuario user = usuariorepository.findByNome(nome)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "Usuario não encontrado: " + nome));

        return UserDetailsImpl.build(user);
    }
}
package com.example.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "authorities")
public class Authority {

    @EmbeddedId
    private AuthorityKey authorityKey;

    @ManyToOne
    @MapsId("userName")
    @JoinColumn(name = "username")
    private User user;

    public static Authority convert(User user, String role) {
        Authority authority = new Authority();

        AuthorityKey authorityKey = new AuthorityKey(user.getUserName(), role);

        authority.setAuthorityKey(authorityKey);
        authority.setUser(user);
        return authority;
    }
}

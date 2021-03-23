package AdopcionAnimales.users;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.publications.Publication;
import AdopcionAnimales.requests.Request;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
public class User implements UserDetails {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(unique = true)
    private String username;

    private String name;
    private String lastnames;
    private String phone;

    @Column(unique = true)
    private String email;

    private String password;
    private String rol;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "user")
    private Set<Animal> animals;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Request> requests;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Publication> publications;

    public User(String username, String name, String lastnames, String phone, String email, String password, String rol){
        this.username = username;
        this.name = name;
        this.lastnames = lastnames;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
    public User(){}
    public void setIdUser(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastnames(String lastnames){
        this.lastnames = lastnames;
    }

    public String getLastnames(){
        return lastnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals){
        this.animals = animals;
    }

    public Set<Publication> getPublications() {
        return publications;
    }

    public void setPublications(Set<Publication> publications){
        this.publications = publications;
    }

    public Set<Request> getRequests() {
        return requests;
    }
    public void setRequests(Set<Request> requests){
        this.requests = requests;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> roleList = new ArrayList<>();
        String assignedRole = null;
        if (rol == "ROLE_ADMIN")
            assignedRole = "ROLE_ADMIN";
        else if (rol == "ROLE_USER")
            assignedRole = "ROLE_USER";
        roleList.add(new SimpleGrantedAuthority(assignedRole));
        return roleList;
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

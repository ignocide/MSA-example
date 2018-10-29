package ignocide.msa.auth.service.user;

import ignocide.msa.auth.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByEmail(String email);
    void create(User user);
}

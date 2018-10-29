package ignocide.msa.auth.service.user.impl;

import ignocide.msa.auth.domain.User;
import ignocide.msa.auth.repository.user.UserRepository;
import ignocide.msa.auth.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Transactional
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void create(User user){
        userRepository.save(user);
    }
}

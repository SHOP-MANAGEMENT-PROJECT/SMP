package com.smp.service;

import com.smp.dto.request.NewCreateUserRequestDto;
import com.smp.dto.request.UpdateUserRequestDto;
import com.smp.exception.ErrorType;
import com.smp.exception.SmpServiceException;
import com.smp.mapper.IUserMapper;
import com.smp.repository.IUserRepository;
import com.smp.repository.entity.User;
import com.smp.repository.entity.enums.ERole;
import com.smp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User,Long> {
    private final IUserRepository userRepository;
    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public Boolean createUser(NewCreateUserRequestDto dto) {
        Optional<User> user2=userRepository.findOptionalByUserName(dto.getUserName());
        if (user2.isPresent()){
            throw new SmpServiceException(ErrorType.USERNAME_DUPLICATE);}
        save(User.builder().userName(dto.getUserName())
                .password(dto.getPassword())
                .name(dto.getName())
                .secondName(dto.getSecondName())
                .lastName(dto.getLastName())
                .secondName(dto.getSecondName())
                .eRole(dto.getERole())
                .build());
        return true;
    }

    public Boolean updateUser(UpdateUserRequestDto dto) {
        Optional<User> user = userRepository.findOptionalByUserName(dto.getUserName());
            if (user.isEmpty()) {
                    throw new SmpServiceException(ErrorType.USERNAME_NOT_FOUND);
            }
            user.get().setUserName(dto.getUserName());
            user.get().setPassword(dto.getPassword());
            user.get().setERole(dto.getERole());
            user.get().setName(dto.getName());
            user.get().setSecondName(dto.getSecondName());
            user.get().setLastName(dto.getLastName());
            user.get().setSecondLastName(dto.getSecondLastName());
            update(user.get());
            return true;
    }
    public Boolean deleteUser(Long id){
        Optional<User> user = findById(id);
        if(user.isEmpty())
            throw new SmpServiceException(ErrorType.USERNAME_NOT_FOUND);
        user.get().setERole(ERole.DELETED);
        update(user.get());
        return true;
    }
}

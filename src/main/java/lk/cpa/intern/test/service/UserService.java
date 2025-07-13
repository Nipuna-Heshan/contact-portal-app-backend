package lk.cpa.intern.test.service;


import lk.cpa.intern.test.to.UserTO;
import lk.cpa.intern.test.type.UserResponse;

public interface UserService {
    UserResponse saveUser(UserTO userTO);
    UserResponse getUser(UserTO userTO);
}

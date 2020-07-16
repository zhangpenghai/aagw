package com.aagw.service;

import com.aagw.entity.Result;
import com.aagw.entity.Uuser;

import java.util.List;

public interface LoginUserService {
    Result UserLogin(Uuser user);
    List<Uuser> findAllUuser();
}

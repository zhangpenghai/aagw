package com.aagw.controller;

import com.aagw.entity.Result;
import com.aagw.entity.Uuser;

import javax.servlet.http.HttpServletRequest;

public interface LoginUserController {

    Result UserLogin(HttpServletRequest request, Uuser user);
}

package com.ddliver.ddpaas.setup.controller

import com.ddliver.ddpaas.common.util.R
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * create by: ddliver
 * description:安装前准备
 * create time:  14:01
 */
@RestController
@RequestMapping("setup")
class BeforSetupController{
    /**
     * create by: ddliver
     * description: 初始化机器配置信息,包括master节点、worker节点IP、用户名、密码等信息
     * create time:  14:02
     * @return
     */
    @PostMapping("init")
    fun initComputerMsg(): R<String>? {
        val r=R("dfsfds");
        return r;

    }
}
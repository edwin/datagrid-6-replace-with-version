package com.edw.controller;

import com.edw.helper.GenerateCacheHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <pre>
 *  com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 17 Jul 2024 16:17
 */
@RestController
public class IndexController {

    @Autowired
    private GenerateCacheHelper generateCacheHelper;

    @GetMapping(path = "/")
    public String init() {
        generateCacheHelper.generate();
        return "good";
    }
}

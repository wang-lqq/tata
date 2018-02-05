'''
Created on 2018年2月3日

@author: Administrator
'''

import http.cookiejar
import urllib

class HtmlDownloader(object):
    
    
    def download(self,url):
        if url is None:
            return None
        #1.安装cookie处理
        cj = http.cookiejar.CookieJar()#cj存储cookie数据
        opener = urllib.request.build_opener(urllib.request.HTTPCookieProcessor(cj))#urllib.request.HTTPCookieProcessor(cj)生成cookieHandler
        #增加访问的头信息:伪装成一个Mozilla/5.0的浏览器
        opener.addheaders = [("user-agent", "Mozilla/5.0")]
        urllib.request.install_opener(opener)
        #下载url对应的html页面
        response=urllib.request.urlopen(url)
        if response.getcode()!=200:
            #请求url对应的网页失败
            return None
        return response.read().decode("utf-8")
        
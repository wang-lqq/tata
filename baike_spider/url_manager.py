'''
Created on 2018年2月3日

@author: Administrator
'''


class UrlManager(object):
    def __init__(self):
        #待爬取的url列表
        self.new_urls=set()
        #爬取过的url列表
        self.old_urls=set()
    def add_new_url(self,url):
        if url is None:
            return
        if url not in self.new_urls and url not in self.old_urls:
            #将url添加到待爬取的列表中
            self.new_urls.add(url)
    def add_new_urls(self,urls):
        if urls is None or len(urls)==0:
            return
        for url in urls:
            self.add_new_url(url)
    def has_new_url(self):
        return len(self.new_urls)!=0
    def get_new_url(self):
        #移除一个url并返回这个url
        new_url=self.new_urls.pop()
        self.old_urls.add(new_url)
        return new_url
'''
Created on 2018年2月3日

@author: Administrator
'''


class HtmlOutputer(object):
    
    def __init__(self):
        self.datas=[]
    def collect_data(self,data):
        if data is None:
            return
        self.datas.append(data)
    def output_html(self):
        with open('e:/output.html', 'w',encoding='utf-8') as fout:
            fout.write("<html>")
            fout.write("<body>")
            fout.write("<table border='1' cellspacing='0'>")
            for data in self.datas:
                fout.write("<tr>")
                fout.write("<td>%s</td>" % data['url'])
                fout.write("<td>%s</td>" % data['title'])
                fout.write("<td>%s</td>" % data['summary'])
                fout.write("/<tr>")
            fout.write("</table>")
            fout.write("</body>")
            fout.write("</html>")    
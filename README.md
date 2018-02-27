【demo主题】  
    lombok常用注解使用演示：@Data @Slf4j(@Log的某个实现)  
【插件安装】  
lombok的官网：http://projectlombok.org/  
1.eclipse  
    　　a.下载lombok.jar包  
    　　b.将lombok.jar包复制到myeclipse.ini/eclipse.ini所在文件目录  
    　　c.打开myeclipse.ini/eclipse.ini，在最后添加以下代码并保存：  
    　　　　-javaagent:lombok.jar  
    　　d.重启myeclipse/eclipse.  
    　　e.project==>clean 清理项目  
2.ideaj  
    a.菜单栏File > Settings > Plugins > Browse repositories...  
    b.搜索 Lombok Plugin 安装后，重启IDEA即可生效  
【测试说明】  
1.启动程序  
   run LombokDemoApplication类main函数  
2.访问服务  
         访问localhost:6661  
3.查看结果  
   a.访问返回结果  
   b.控制台打印日志  
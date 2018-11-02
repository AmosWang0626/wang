# 家谱系统

## 技术栈
> - spring boot | jpa | docker
> - front in development

### Docker 命令
- 构建镜像: mvn package dockerfile:build
- 查看镜像: docker images
- 运行项目: docker run -d -p 8888:8080 --name genealogy amos/genealogy
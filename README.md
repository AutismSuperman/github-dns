# github-dns
**使用github action 定时爬取 github 最新的dns解析**。

没有kx上网是真的麻烦。

**如何使用**：

把ip和域名对应加入到 hosts 文件中即可。

Linux/Mac 系统：/etc/hosts  
Windows 系统：C:\Windows\System32\drivers\etc\hosts  
Android（安卓）系统：/system/etc/hosts

推荐工具 [SwitchHosts](https://oldj.github.io/SwitchHosts/)

# update 2023-04-03 00:58:15
```
140.82.113.4                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.5                  api.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.111.133               raw.github.com
140.82.112.3                  gist.github.com
140.82.114.4                  octocaptcha.com
140.82.112.17                 help.github.com
140.82.113.26                 live.github.com
140.82.112.18                 github.community
185.199.111.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.108.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
185.199.109.153               pages.github.com
140.82.113.17                 status.github.com
140.82.112.13                 uploads.github.com
140.82.112.9                  nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
140.82.113.9                  codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.108.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.108.153               documentcloud.github.com
185.199.109.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
52.216.24.164                 github-com.s3.amazonaws.com
52.216.131.171                github-com.s3.amazonaws.com
52.217.114.17                 github-com.s3.amazonaws.com
52.217.196.73                 github-com.s3.amazonaws.com
52.216.208.249                github-com.s3.amazonaws.com
52.216.37.49                  github-com.s3.amazonaws.com
52.217.114.9                  github-com.s3.amazonaws.com
52.217.48.28                  github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
52.216.107.76                 github-cloud.s3.amazonaws.com
3.5.29.163                    github-cloud.s3.amazonaws.com
52.216.39.1                   github-cloud.s3.amazonaws.com
52.217.235.1                  github-cloud.s3.amazonaws.com
3.5.25.141                    github-cloud.s3.amazonaws.com
3.5.27.156                    github-cloud.s3.amazonaws.com
52.217.228.185                github-cloud.s3.amazonaws.com
52.217.162.121                github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.110.133               user-images.githubusercontent.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
52.216.24.164                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.131.171                github-production-user-asset-6210df.s3.amazonaws.com
52.217.114.17                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.196.73                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.208.249                github-production-user-asset-6210df.s3.amazonaws.com
52.216.37.49                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.114.9                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.48.28                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.165.187                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.138.113                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.140.33                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.29.123                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.226.224                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.224.81                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.37.249                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.137.41                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.165.187                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.138.113                github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.140.33                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.29.123                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.226.224                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.224.81                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.37.249                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.137.41                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```
# github-dns
**使用github action 定时爬取 github 最新的dns解析**。

没有kx上网是真的麻烦。

**如何使用**：

把ip和域名对应加入到 hosts 文件中即可。

Linux/Mac 系统：/etc/hosts  
Windows 系统：C:\Windows\System32\drivers\etc\hosts  
Android（安卓）系统：/system/etc/hosts

推荐工具 [SwitchHosts](https://oldj.github.io/SwitchHosts/)

# update 2023-01-23 12:24:12
```
140.82.114.4                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.5                  api.github.com
185.199.111.133               raw.github.com
185.199.108.133               raw.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
140.82.114.4                  gist.github.com
192.30.255.112                octocaptcha.com
140.82.114.17                 help.github.com
140.82.112.26                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
185.199.108.153               pages.github.com
140.82.112.18                 status.github.com
140.82.112.14                 uploads.github.com
140.82.113.9                  nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
140.82.112.10                 codeload.github.com
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
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
52.216.12.100                 github-com.s3.amazonaws.com
52.217.225.81                 github-com.s3.amazonaws.com
52.217.197.97                 github-com.s3.amazonaws.com
54.231.130.177                github-com.s3.amazonaws.com
52.217.78.44                  github-com.s3.amazonaws.com
52.216.153.124                github-com.s3.amazonaws.com
52.216.133.243                github-com.s3.amazonaws.com
52.216.171.147                github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
3.5.9.19                      github-cloud.s3.amazonaws.com
3.5.21.193                    github-cloud.s3.amazonaws.com
52.217.13.100                 github-cloud.s3.amazonaws.com
52.216.102.75                 github-cloud.s3.amazonaws.com
52.217.79.204                 github-cloud.s3.amazonaws.com
52.216.97.11                  github-cloud.s3.amazonaws.com
54.231.203.17                 github-cloud.s3.amazonaws.com
52.216.168.115                github-cloud.s3.amazonaws.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
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
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
52.216.12.100                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.225.81                 github-production-user-asset-6210df.s3.amazonaws.com
52.217.197.97                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.130.177                github-production-user-asset-6210df.s3.amazonaws.com
52.217.78.44                  github-production-user-asset-6210df.s3.amazonaws.com
52.216.153.124                github-production-user-asset-6210df.s3.amazonaws.com
52.216.133.243                github-production-user-asset-6210df.s3.amazonaws.com
52.216.171.147                github-production-user-asset-6210df.s3.amazonaws.com
52.216.110.11                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.214.209                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.3.185                     github-production-release-asset-2e65be.s3.amazonaws.com
54.231.200.161                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.200.209                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.129.193                github-production-release-asset-2e65be.s3.amazonaws.com
54.231.194.153                github-production-release-asset-2e65be.s3.amazonaws.com
52.216.78.212                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.1.144                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.77.164                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.51.233                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.20.157                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.64.100                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.168.177                github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.202.209                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.195.41                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```
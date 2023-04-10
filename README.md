# github-dns
**使用github action 定时爬取 github 最新的dns解析**。

没有kx上网是真的麻烦。

**如何使用**：

把ip和域名对应加入到 hosts 文件中即可。

Linux/Mac 系统：/etc/hosts  
Windows 系统：C:\Windows\System32\drivers\etc\hosts  
Android（安卓）系统：/system/etc/hosts

推荐工具 [SwitchHosts](https://oldj.github.io/SwitchHosts/)

# update 2023-04-10 00:58:43
```
140.82.114.3                  github.com
192.0.66.2                    github.blog
140.82.112.29                 githubapp.com
140.82.112.30                 githubapp.com
140.82.113.29                 githubapp.com
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.114.6                  api.github.com
185.199.108.133               raw.github.com
185.199.109.133               raw.github.com
185.199.110.133               raw.github.com
185.199.111.133               raw.github.com
140.82.112.3                  gist.github.com
140.82.113.4                  octocaptcha.com
140.82.113.18                 help.github.com
140.82.112.25                 live.github.com
140.82.112.17                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.110.153               pages.github.com
185.199.111.153               pages.github.com
140.82.112.17                 status.github.com
140.82.114.14                 uploads.github.com
140.82.113.10                 nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
140.82.113.10                 codeload.github.com
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
185.199.109.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.110.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.108.133               gist.githubusercontent.com
185.199.109.133               gist.githubusercontent.com
185.199.110.133               gist.githubusercontent.com
185.199.111.133               gist.githubusercontent.com
185.199.108.133               camo.githubusercontent.com
185.199.109.133               camo.githubusercontent.com
185.199.110.133               camo.githubusercontent.com
185.199.111.133               camo.githubusercontent.com
185.199.108.133               cloud.githubusercontent.com
185.199.109.133               cloud.githubusercontent.com
185.199.110.133               cloud.githubusercontent.com
185.199.111.133               cloud.githubusercontent.com
185.199.108.133               media.githubusercontent.com
185.199.109.133               media.githubusercontent.com
185.199.110.133               media.githubusercontent.com
185.199.111.133               media.githubusercontent.com
52.216.42.241                 github-com.s3.amazonaws.com
52.216.62.233                 github-com.s3.amazonaws.com
52.217.49.4                   github-com.s3.amazonaws.com
52.217.233.225                github-com.s3.amazonaws.com
52.216.57.121                 github-com.s3.amazonaws.com
52.217.9.28                   github-com.s3.amazonaws.com
52.217.108.84                 github-com.s3.amazonaws.com
52.217.114.193                github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.108.133               desktop.githubusercontent.com
185.199.109.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
52.217.132.129                github-cloud.s3.amazonaws.com
52.217.205.185                github-cloud.s3.amazonaws.com
54.231.199.73                 github-cloud.s3.amazonaws.com
3.5.11.154                    github-cloud.s3.amazonaws.com
52.217.195.249                github-cloud.s3.amazonaws.com
52.217.164.33                 github-cloud.s3.amazonaws.com
54.231.135.1                  github-cloud.s3.amazonaws.com
52.217.231.169                github-cloud.s3.amazonaws.com
185.199.109.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.108.133               avatars.githubusercontent.com
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
185.199.111.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
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
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
52.217.132.129                github-production-user-asset-6210df.s3.amazonaws.com
52.217.205.185                github-production-user-asset-6210df.s3.amazonaws.com
54.231.199.73                 github-production-user-asset-6210df.s3.amazonaws.com
3.5.11.154                    github-production-user-asset-6210df.s3.amazonaws.com
52.217.195.249                github-production-user-asset-6210df.s3.amazonaws.com
52.217.164.33                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.135.1                  github-production-user-asset-6210df.s3.amazonaws.com
52.217.231.169                github-production-user-asset-6210df.s3.amazonaws.com
52.216.101.235                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.19.21                     github-production-release-asset-2e65be.s3.amazonaws.com
54.231.164.233                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.75.193                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.202.225                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.43.156                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.75.28                  github-production-release-asset-2e65be.s3.amazonaws.com
52.216.112.195                github-production-release-asset-2e65be.s3.amazonaws.com
52.217.132.129                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.205.185                github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.199.73                 github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.11.154                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.195.249                github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.164.33                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.135.1                  github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.231.169                github-production-repository-file-5c1aeb.s3.amazonaws.com
```
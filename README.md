# github-dns
**使用github action 定时爬取 github 最新的dns解析**。

没有kx上网是真的麻烦。

**如何使用**：

把ip和域名对应加入到 hosts 文件中即可。

Linux/Mac 系统：/etc/hosts  
Windows 系统：C:\Windows\System32\drivers\etc\hosts  
Android（安卓）系统：/system/etc/hosts

推荐工具 [SwitchHosts](https://oldj.github.io/SwitchHosts/)

# update 2023-02-06 01:02:43
```
192.30.255.112                github.com
192.0.66.2                    github.blog
140.82.113.30                 githubapp.com
140.82.114.29                 githubapp.com
140.82.113.29                 githubapp.com
140.82.114.30                 githubapp.com
140.82.112.30                 githubapp.com
140.82.112.29                 githubapp.com
192.30.255.116                api.github.com
185.199.111.133               raw.github.com
185.199.110.133               raw.github.com
185.199.109.133               raw.github.com
185.199.108.133               raw.github.com
192.30.255.113                gist.github.com
192.30.255.113                octocaptcha.com
140.82.114.17                 help.github.com
140.82.114.25                 live.github.com
140.82.114.18                 github.community
185.199.108.153               githubstatus.com
185.199.109.153               githubstatus.com
185.199.110.153               githubstatus.com
185.199.111.153               githubstatus.com
185.199.108.153               pages.github.com
185.199.109.153               pages.github.com
185.199.111.153               pages.github.com
185.199.110.153               pages.github.com
140.82.112.18                 status.github.com
192.30.255.98                 uploads.github.com
192.30.255.121                nodeload.github.com
185.199.108.153               training.github.com
185.199.109.153               training.github.com
185.199.110.153               training.github.com
185.199.111.153               training.github.com
192.30.255.120                codeload.github.com
185.199.108.153               assets-cdn.github.com
185.199.109.153               assets-cdn.github.com
185.199.110.153               assets-cdn.github.com
185.199.111.153               assets-cdn.github.com
185.199.108.154               github.githubassets.com
185.199.109.154               github.githubassets.com
185.199.110.154               github.githubassets.com
185.199.111.154               github.githubassets.com
185.199.109.153               documentcloud.github.com
185.199.111.153               documentcloud.github.com
185.199.110.153               documentcloud.github.com
185.199.108.153               documentcloud.github.com
185.199.110.133               raw.githubusercontent.com
185.199.111.133               raw.githubusercontent.com
185.199.108.133               raw.githubusercontent.com
185.199.109.133               raw.githubusercontent.com
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
3.5.17.221                    github-com.s3.amazonaws.com
3.5.20.225                    github-com.s3.amazonaws.com
52.216.217.225                github-com.s3.amazonaws.com
3.5.10.109                    github-com.s3.amazonaws.com
52.217.75.156                 github-com.s3.amazonaws.com
52.216.128.91                 github-com.s3.amazonaws.com
52.217.195.57                 github-com.s3.amazonaws.com
54.231.128.81                 github-com.s3.amazonaws.com
151.101.1.194                 github.global.ssl.fastly.net
151.101.65.194                github.global.ssl.fastly.net
151.101.129.194               github.global.ssl.fastly.net
151.101.193.194               github.global.ssl.fastly.net
185.199.109.133               desktop.githubusercontent.com
185.199.108.133               desktop.githubusercontent.com
185.199.111.133               desktop.githubusercontent.com
185.199.110.133               desktop.githubusercontent.com
3.5.17.221                    github-cloud.s3.amazonaws.com
3.5.20.225                    github-cloud.s3.amazonaws.com
52.216.217.225                github-cloud.s3.amazonaws.com
3.5.10.109                    github-cloud.s3.amazonaws.com
52.217.75.156                 github-cloud.s3.amazonaws.com
52.216.128.91                 github-cloud.s3.amazonaws.com
52.217.195.57                 github-cloud.s3.amazonaws.com
54.231.128.81                 github-cloud.s3.amazonaws.com
185.199.108.133               avatars.githubusercontent.com
185.199.110.133               avatars.githubusercontent.com
185.199.111.133               avatars.githubusercontent.com
185.199.109.133               avatars.githubusercontent.com
185.199.108.133               favicons.githubusercontent.com
185.199.109.133               favicons.githubusercontent.com
185.199.110.133               favicons.githubusercontent.com
185.199.111.133               favicons.githubusercontent.com
185.199.108.133               avatars0.githubusercontent.com
185.199.109.133               avatars0.githubusercontent.com
185.199.110.133               avatars0.githubusercontent.com
185.199.111.133               avatars0.githubusercontent.com
185.199.109.133               avatars1.githubusercontent.com
185.199.108.133               avatars1.githubusercontent.com
185.199.111.133               avatars1.githubusercontent.com
185.199.110.133               avatars1.githubusercontent.com
185.199.108.133               avatars2.githubusercontent.com
185.199.109.133               avatars2.githubusercontent.com
185.199.110.133               avatars2.githubusercontent.com
185.199.111.133               avatars2.githubusercontent.com
185.199.108.133               avatars3.githubusercontent.com
185.199.109.133               avatars3.githubusercontent.com
185.199.110.133               avatars3.githubusercontent.com
185.199.111.133               avatars3.githubusercontent.com
185.199.108.133               avatars4.githubusercontent.com
185.199.111.133               avatars4.githubusercontent.com
185.199.110.133               avatars4.githubusercontent.com
185.199.109.133               avatars4.githubusercontent.com
185.199.108.133               avatars5.githubusercontent.com
185.199.109.133               avatars5.githubusercontent.com
185.199.110.133               avatars5.githubusercontent.com
185.199.111.133               avatars5.githubusercontent.com
185.199.111.133               avatars6.githubusercontent.com
185.199.109.133               avatars6.githubusercontent.com
185.199.110.133               avatars6.githubusercontent.com
185.199.108.133               avatars6.githubusercontent.com
185.199.111.133               avatars7.githubusercontent.com
185.199.108.133               avatars7.githubusercontent.com
185.199.109.133               avatars7.githubusercontent.com
185.199.110.133               avatars7.githubusercontent.com
185.199.108.133               avatars8.githubusercontent.com
185.199.109.133               avatars8.githubusercontent.com
185.199.110.133               avatars8.githubusercontent.com
185.199.111.133               avatars8.githubusercontent.com
185.199.108.153               customer-stories-feed.github.com
185.199.110.153               customer-stories-feed.github.com
185.199.109.153               customer-stories-feed.github.com
185.199.111.153               customer-stories-feed.github.com
185.199.108.133               user-images.githubusercontent.com
185.199.109.133               user-images.githubusercontent.com
185.199.110.133               user-images.githubusercontent.com
185.199.111.133               user-images.githubusercontent.com
185.199.111.133               repository-images.githubusercontent.com
185.199.109.133               repository-images.githubusercontent.com
185.199.110.133               repository-images.githubusercontent.com
185.199.108.133               repository-images.githubusercontent.com
185.199.108.133               marketplace-screenshots.githubusercontent.com
185.199.109.133               marketplace-screenshots.githubusercontent.com
185.199.110.133               marketplace-screenshots.githubusercontent.com
185.199.111.133               marketplace-screenshots.githubusercontent.com
54.231.193.249                github-production-user-asset-6210df.s3.amazonaws.com
52.216.21.219                 github-production-user-asset-6210df.s3.amazonaws.com
54.231.164.169                github-production-user-asset-6210df.s3.amazonaws.com
3.5.11.149                    github-production-user-asset-6210df.s3.amazonaws.com
3.5.29.145                    github-production-user-asset-6210df.s3.amazonaws.com
52.216.49.185                 github-production-user-asset-6210df.s3.amazonaws.com
52.216.241.172                github-production-user-asset-6210df.s3.amazonaws.com
54.231.168.217                github-production-user-asset-6210df.s3.amazonaws.com
3.5.17.221                    github-production-release-asset-2e65be.s3.amazonaws.com
3.5.20.225                    github-production-release-asset-2e65be.s3.amazonaws.com
52.216.217.225                github-production-release-asset-2e65be.s3.amazonaws.com
3.5.10.109                    github-production-release-asset-2e65be.s3.amazonaws.com
52.217.75.156                 github-production-release-asset-2e65be.s3.amazonaws.com
52.216.128.91                 github-production-release-asset-2e65be.s3.amazonaws.com
52.217.195.57                 github-production-release-asset-2e65be.s3.amazonaws.com
54.231.128.81                 github-production-release-asset-2e65be.s3.amazonaws.com
3.5.17.221                    github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.20.225                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.217.225                github-production-repository-file-5c1aeb.s3.amazonaws.com
3.5.10.109                    github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.75.156                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.216.128.91                 github-production-repository-file-5c1aeb.s3.amazonaws.com
52.217.195.57                 github-production-repository-file-5c1aeb.s3.amazonaws.com
54.231.128.81                 github-production-repository-file-5c1aeb.s3.amazonaws.com
```
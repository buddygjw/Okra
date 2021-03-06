# Okra

Okra是一个使用JAVA语言开发的高性能，高扩展，高并发，低延迟的简单的服务器框架。
主要目的是帮助**中小团队**快速开发实现**网络游戏服务端**。

## Dependencies：
 1. JDK 1.8
 2. [Netty 4.x](https://netty.io): 框架实现高效稳定的网络通信层支持。
 3. [Disruptor 3.x](https://github.com/LMAX-Exchange/disruptor): 框架实现高吞吐量的并发任务支持。
 4. 集成Spring框架(optional): 集成Spring框架以使用大量Spring系的工具. 例如:Mybatis，Hibernate，HikariCP等。

```xml
    <dependency>
        <groupId>io.netty</groupId>
        <artifactId>netty-all</artifactId>
        <version>4.0.36.Final</version>
    </dependency>
    <dependency>
        <groupId>com.lmax</groupId>
        <artifactId>disruptor</artifactId>
        <version>3.3.2</version>
    </dependency>
```

## Documents
 1. [Okra Wiki](https://github.com/ogcs/Okra/wiki)
 2. [Get Started](https://github.com/ogcs/Okra/wiki/Get-started)
 3. [Author's Blog](https://tinyzzh.github.io)

## How to Contribute ?
 Fork代码之后欢迎pr.

## 为什么开发Okra?
  Just for fun ! 无聊练练手，写点东西.代码可能存在一些不成熟的地方, 欢迎反馈，我会尽快修复，完善.

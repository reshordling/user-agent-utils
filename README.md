# User Agent Utils

A Java utility library for processing user-agent strings. Can be used to handle http requests in real-time or to analyze log files.

## Difference from the original repo

Since the original repo is not being maintained, we took time to clean this up and we are now maintaining it with the following changes:

1. All codes are formatted to use Spaces instead of Tabs
2. Using Gradle to build, test & release instead of MVN
3. groupId has been changed from `eu.bitwalker` to `com.wizpanda`
4. artifactId has been changed from `UserAgentUtils` to `user-agent-utils`

## Advice

A lot of user-agents lie about their identity. That makes UA sniffing a guessing game. On websites it is a better approach to detect
features using a javascript library like Modernizr (http://modernizr.com/). Instead of using browser switches, build sites and services
that are cross-platform/cross-device compatible.       

## Javadoc

http://bitwalker.eu/user-agent-utils-snapshot/javadoc/index.html

## Installation

This library has been deployed at https://bintray.com/wizpanda/maven/user-agent-utils

### Gradle

```groovy
compile "com.wizpanda:user-agent-utils:0.0.1"
```

### Maven

```xml
<dependency>
   <groupId>com.wizpanda</groupId>
   <artifactId>user-agent-utils</artifactId>
   <version>0.0.1</version>
</dependency>
```

## Contributors

* Code has been contributed by: Nathan Maves, Francisco Collao (https://github.com/pcollaog), Madgency (https://github.com/guignol),
Pavel Sher (https://github.com/pavelsher), Pierre Etchemaite, Alexander Radzin (https://github.com/alexradzin), SeabassNg (https://github.com/SeabassNg), Sudeep Sinha (https://github.com/sudeep-sinha), John Dydo, frankdev (https://github.com/frankdev), Lew Dawson, Joachim Mueller (https://github.com/joachimmueller), Jason Calabrese (https://github.com/jasoncalabrese), Thorsten Schaefer, Parker Seidel (https://github.com/parker), Joris Aerts (https://github.com/JorisAerts), Stephan Heffner, Filipe Névola (https://github.com/filipenevola), John Patrick (https://github.com/nhojpatrick), Konrad Kubacki (https://github.com/konradkg), Vipul Delwadia (https://github.com/vipuldelwadia) and more. A BIG thank you to all of them!

## FAQ

**1. Can I add new browsers or operating systems?**
  
Unfortunately not directly. This library uses enums to represent browsers and operating systems to make using it easy and readable. 
Unfortunately the use of enums also has some disadvantages. You can make a pull request on trunk for a new browser or operating system
if all tests are still passing. The purpose of this library is not to detect every possible version, so you’ll have to provide the 
business value for a change.

**2. Where can I report bugs or make feature requests**
  
Go to https://github.com/HaraldWalker/user-agent-utils/issues

**3. How can I improve the performance of the user-agent parsing?**
  
When handling requests on a web-server, consider if you need both the browser and operating system or if one of the two gives you enough
information. As the parsing uses an ordered tree structure, performance depends a lot on the type of clients making the requests. The 
most common browsers and operating systems will be parsed faster than exotic ones. Consider caching the results temporarily.

**4. Are there other libraries like this?**
  
When I started this project in 2010 there were no other libraries offering the features I was looking for. Currently there are both open 
source as well as commercial solutions.
  

## Change Log

See [CHANGELOG.md](https://github.com/wizpanda/user-agent-utils/blob/master/CHANGELOG.md). For old change logs, see
[this](https://github.com/wizpanda/user-agent-utils/commit/66395c1c84f66ed613bfbe5768f80002625cf889) commit.
# basic-spray.g8

This is a minimum [giter8] template for [Spray] and sbt projects.

* sbt
* scalatest
* scalacheck
* idea-gen
* scalariform
* spray
* akka (spray depends this)

## Installation

```console
$ g8 shouldbee/basic-spray
$ cd <project-name>
```

## Start HTTP Server

Start Spray HTTP server type `reStart` in sbt console:

```console
$ ./sbt
> reStart
```

Then request against `localhost:8080/hello` via any browser or command like [httpie]:

```console
$ http localhost:8080/hello                                                                                                                                                                                                                                          [13:48:37]
HTTP/1.1 200 OK
Content-Length: 19
Content-Type: text/plain; charset=UTF-8
Date: Wed, 25 Jun 2014 04:55:00 GMT
Server: spray-can/1.3.1

Hello org.foo.bar!
```

## Stop HTTP Server

To stop HTTP Server type `reStop` in sbt console:

```console
> reStop
```

[giter8]: https://github.com/n8han/giter8
[Spray]: http://spray.io
[httpie]: https://github.com/jakubroztocil/httpie

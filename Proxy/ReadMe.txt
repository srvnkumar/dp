The proxy pattern provides a surrogate or placeholder for another object to control access to it.
you use it when you want lazy loading, access control, logging, caching, remote calls, or
performance optimization without changing the real object.

why its required
sometimes you dont want the client to directly access the real object because
-> The real object is heavy (ex: expensive DB connection, large file, remote service).
-> you want to add behaviour (logging, caching, security checks).
-> you want lazy initialization (create object only when needed).

Proxy acts as a middle layer.
-> you want control over access.
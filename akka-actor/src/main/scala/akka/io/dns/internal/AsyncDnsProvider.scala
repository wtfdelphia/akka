/*
 * Copyright (C) 2018-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.io.dns.internal

import com.github.ghik.silencer.silent

import akka.annotation.InternalApi
import akka.io._

/**
 * INTERNAL API
 */
@InternalApi
@silent("deprecated")
private[akka] class AsyncDnsProvider extends DnsProvider {
  override def cache: Dns = new SimpleDnsCache()
  override def actorClass = classOf[AsyncDnsResolver]
  override def managerClass = classOf[AsyncDnsManager]
}

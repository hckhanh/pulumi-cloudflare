# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SpectrumApplicationArgs', 'SpectrumApplication']

@pulumi.input_type
class SpectrumApplicationArgs:
    def __init__(__self__, *,
                 dns: pulumi.Input['SpectrumApplicationDnsArgs'],
                 protocol: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 argo_smart_routing: Optional[pulumi.Input[bool]] = None,
                 edge_ips: Optional[pulumi.Input['SpectrumApplicationEdgeIpsArgs']] = None,
                 ip_firewall: Optional[pulumi.Input[bool]] = None,
                 origin_directs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 origin_dns: Optional[pulumi.Input['SpectrumApplicationOriginDnsArgs']] = None,
                 origin_port: Optional[pulumi.Input[int]] = None,
                 origin_port_range: Optional[pulumi.Input['SpectrumApplicationOriginPortRangeArgs']] = None,
                 proxy_protocol: Optional[pulumi.Input[str]] = None,
                 tls: Optional[pulumi.Input[str]] = None,
                 traffic_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SpectrumApplication resource.
        :param pulumi.Input['SpectrumApplicationDnsArgs'] dns: The name and type of DNS record for the Spectrum application.
        :param pulumi.Input[str] protocol: The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        :param pulumi.Input[bool] argo_smart_routing: Enables Argo Smart Routing.
        :param pulumi.Input['SpectrumApplicationEdgeIpsArgs'] edge_ips: The anycast edge IP configuration for the hostname of this application.
        :param pulumi.Input[bool] ip_firewall: Enables the IP Firewall for this application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] origin_directs: A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        :param pulumi.Input['SpectrumApplicationOriginDnsArgs'] origin_dns: A destination DNS addresses to the origin.
        :param pulumi.Input[int] origin_port: Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        :param pulumi.Input['SpectrumApplicationOriginPortRangeArgs'] origin_port_range: Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        :param pulumi.Input[str] proxy_protocol: Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        :param pulumi.Input[str] tls: TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        :param pulumi.Input[str] traffic_type: Sets application type. Available values: `direct`, `http`, `https`.
        """
        pulumi.set(__self__, "dns", dns)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "zone_id", zone_id)
        if argo_smart_routing is not None:
            pulumi.set(__self__, "argo_smart_routing", argo_smart_routing)
        if edge_ips is not None:
            pulumi.set(__self__, "edge_ips", edge_ips)
        if ip_firewall is not None:
            pulumi.set(__self__, "ip_firewall", ip_firewall)
        if origin_directs is not None:
            pulumi.set(__self__, "origin_directs", origin_directs)
        if origin_dns is not None:
            pulumi.set(__self__, "origin_dns", origin_dns)
        if origin_port is not None:
            pulumi.set(__self__, "origin_port", origin_port)
        if origin_port_range is not None:
            pulumi.set(__self__, "origin_port_range", origin_port_range)
        if proxy_protocol is not None:
            pulumi.set(__self__, "proxy_protocol", proxy_protocol)
        if tls is not None:
            pulumi.set(__self__, "tls", tls)
        if traffic_type is not None:
            pulumi.set(__self__, "traffic_type", traffic_type)

    @property
    @pulumi.getter
    def dns(self) -> pulumi.Input['SpectrumApplicationDnsArgs']:
        """
        The name and type of DNS record for the Spectrum application.
        """
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: pulumi.Input['SpectrumApplicationDnsArgs']):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="argoSmartRouting")
    def argo_smart_routing(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables Argo Smart Routing.
        """
        return pulumi.get(self, "argo_smart_routing")

    @argo_smart_routing.setter
    def argo_smart_routing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "argo_smart_routing", value)

    @property
    @pulumi.getter(name="edgeIps")
    def edge_ips(self) -> Optional[pulumi.Input['SpectrumApplicationEdgeIpsArgs']]:
        """
        The anycast edge IP configuration for the hostname of this application.
        """
        return pulumi.get(self, "edge_ips")

    @edge_ips.setter
    def edge_ips(self, value: Optional[pulumi.Input['SpectrumApplicationEdgeIpsArgs']]):
        pulumi.set(self, "edge_ips", value)

    @property
    @pulumi.getter(name="ipFirewall")
    def ip_firewall(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables the IP Firewall for this application.
        """
        return pulumi.get(self, "ip_firewall")

    @ip_firewall.setter
    def ip_firewall(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ip_firewall", value)

    @property
    @pulumi.getter(name="originDirects")
    def origin_directs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        """
        return pulumi.get(self, "origin_directs")

    @origin_directs.setter
    def origin_directs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "origin_directs", value)

    @property
    @pulumi.getter(name="originDns")
    def origin_dns(self) -> Optional[pulumi.Input['SpectrumApplicationOriginDnsArgs']]:
        """
        A destination DNS addresses to the origin.
        """
        return pulumi.get(self, "origin_dns")

    @origin_dns.setter
    def origin_dns(self, value: Optional[pulumi.Input['SpectrumApplicationOriginDnsArgs']]):
        pulumi.set(self, "origin_dns", value)

    @property
    @pulumi.getter(name="originPort")
    def origin_port(self) -> Optional[pulumi.Input[int]]:
        """
        Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        """
        return pulumi.get(self, "origin_port")

    @origin_port.setter
    def origin_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "origin_port", value)

    @property
    @pulumi.getter(name="originPortRange")
    def origin_port_range(self) -> Optional[pulumi.Input['SpectrumApplicationOriginPortRangeArgs']]:
        """
        Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        """
        return pulumi.get(self, "origin_port_range")

    @origin_port_range.setter
    def origin_port_range(self, value: Optional[pulumi.Input['SpectrumApplicationOriginPortRangeArgs']]):
        pulumi.set(self, "origin_port_range", value)

    @property
    @pulumi.getter(name="proxyProtocol")
    def proxy_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        """
        return pulumi.get(self, "proxy_protocol")

    @proxy_protocol.setter
    def proxy_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proxy_protocol", value)

    @property
    @pulumi.getter
    def tls(self) -> Optional[pulumi.Input[str]]:
        """
        TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        """
        return pulumi.get(self, "tls")

    @tls.setter
    def tls(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tls", value)

    @property
    @pulumi.getter(name="trafficType")
    def traffic_type(self) -> Optional[pulumi.Input[str]]:
        """
        Sets application type. Available values: `direct`, `http`, `https`.
        """
        return pulumi.get(self, "traffic_type")

    @traffic_type.setter
    def traffic_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_type", value)


@pulumi.input_type
class _SpectrumApplicationState:
    def __init__(__self__, *,
                 argo_smart_routing: Optional[pulumi.Input[bool]] = None,
                 dns: Optional[pulumi.Input['SpectrumApplicationDnsArgs']] = None,
                 edge_ips: Optional[pulumi.Input['SpectrumApplicationEdgeIpsArgs']] = None,
                 ip_firewall: Optional[pulumi.Input[bool]] = None,
                 origin_directs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 origin_dns: Optional[pulumi.Input['SpectrumApplicationOriginDnsArgs']] = None,
                 origin_port: Optional[pulumi.Input[int]] = None,
                 origin_port_range: Optional[pulumi.Input['SpectrumApplicationOriginPortRangeArgs']] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 proxy_protocol: Optional[pulumi.Input[str]] = None,
                 tls: Optional[pulumi.Input[str]] = None,
                 traffic_type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SpectrumApplication resources.
        :param pulumi.Input[bool] argo_smart_routing: Enables Argo Smart Routing.
        :param pulumi.Input['SpectrumApplicationDnsArgs'] dns: The name and type of DNS record for the Spectrum application.
        :param pulumi.Input['SpectrumApplicationEdgeIpsArgs'] edge_ips: The anycast edge IP configuration for the hostname of this application.
        :param pulumi.Input[bool] ip_firewall: Enables the IP Firewall for this application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] origin_directs: A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        :param pulumi.Input['SpectrumApplicationOriginDnsArgs'] origin_dns: A destination DNS addresses to the origin.
        :param pulumi.Input[int] origin_port: Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        :param pulumi.Input['SpectrumApplicationOriginPortRangeArgs'] origin_port_range: Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        :param pulumi.Input[str] protocol: The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        :param pulumi.Input[str] proxy_protocol: Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        :param pulumi.Input[str] tls: TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        :param pulumi.Input[str] traffic_type: Sets application type. Available values: `direct`, `http`, `https`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        if argo_smart_routing is not None:
            pulumi.set(__self__, "argo_smart_routing", argo_smart_routing)
        if dns is not None:
            pulumi.set(__self__, "dns", dns)
        if edge_ips is not None:
            pulumi.set(__self__, "edge_ips", edge_ips)
        if ip_firewall is not None:
            pulumi.set(__self__, "ip_firewall", ip_firewall)
        if origin_directs is not None:
            pulumi.set(__self__, "origin_directs", origin_directs)
        if origin_dns is not None:
            pulumi.set(__self__, "origin_dns", origin_dns)
        if origin_port is not None:
            pulumi.set(__self__, "origin_port", origin_port)
        if origin_port_range is not None:
            pulumi.set(__self__, "origin_port_range", origin_port_range)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if proxy_protocol is not None:
            pulumi.set(__self__, "proxy_protocol", proxy_protocol)
        if tls is not None:
            pulumi.set(__self__, "tls", tls)
        if traffic_type is not None:
            pulumi.set(__self__, "traffic_type", traffic_type)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="argoSmartRouting")
    def argo_smart_routing(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables Argo Smart Routing.
        """
        return pulumi.get(self, "argo_smart_routing")

    @argo_smart_routing.setter
    def argo_smart_routing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "argo_smart_routing", value)

    @property
    @pulumi.getter
    def dns(self) -> Optional[pulumi.Input['SpectrumApplicationDnsArgs']]:
        """
        The name and type of DNS record for the Spectrum application.
        """
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: Optional[pulumi.Input['SpectrumApplicationDnsArgs']]):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter(name="edgeIps")
    def edge_ips(self) -> Optional[pulumi.Input['SpectrumApplicationEdgeIpsArgs']]:
        """
        The anycast edge IP configuration for the hostname of this application.
        """
        return pulumi.get(self, "edge_ips")

    @edge_ips.setter
    def edge_ips(self, value: Optional[pulumi.Input['SpectrumApplicationEdgeIpsArgs']]):
        pulumi.set(self, "edge_ips", value)

    @property
    @pulumi.getter(name="ipFirewall")
    def ip_firewall(self) -> Optional[pulumi.Input[bool]]:
        """
        Enables the IP Firewall for this application.
        """
        return pulumi.get(self, "ip_firewall")

    @ip_firewall.setter
    def ip_firewall(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ip_firewall", value)

    @property
    @pulumi.getter(name="originDirects")
    def origin_directs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        """
        return pulumi.get(self, "origin_directs")

    @origin_directs.setter
    def origin_directs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "origin_directs", value)

    @property
    @pulumi.getter(name="originDns")
    def origin_dns(self) -> Optional[pulumi.Input['SpectrumApplicationOriginDnsArgs']]:
        """
        A destination DNS addresses to the origin.
        """
        return pulumi.get(self, "origin_dns")

    @origin_dns.setter
    def origin_dns(self, value: Optional[pulumi.Input['SpectrumApplicationOriginDnsArgs']]):
        pulumi.set(self, "origin_dns", value)

    @property
    @pulumi.getter(name="originPort")
    def origin_port(self) -> Optional[pulumi.Input[int]]:
        """
        Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        """
        return pulumi.get(self, "origin_port")

    @origin_port.setter
    def origin_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "origin_port", value)

    @property
    @pulumi.getter(name="originPortRange")
    def origin_port_range(self) -> Optional[pulumi.Input['SpectrumApplicationOriginPortRangeArgs']]:
        """
        Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        """
        return pulumi.get(self, "origin_port_range")

    @origin_port_range.setter
    def origin_port_range(self, value: Optional[pulumi.Input['SpectrumApplicationOriginPortRangeArgs']]):
        pulumi.set(self, "origin_port_range", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="proxyProtocol")
    def proxy_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        """
        return pulumi.get(self, "proxy_protocol")

    @proxy_protocol.setter
    def proxy_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proxy_protocol", value)

    @property
    @pulumi.getter
    def tls(self) -> Optional[pulumi.Input[str]]:
        """
        TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        """
        return pulumi.get(self, "tls")

    @tls.setter
    def tls(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tls", value)

    @property
    @pulumi.getter(name="trafficType")
    def traffic_type(self) -> Optional[pulumi.Input[str]]:
        """
        Sets application type. Available values: `direct`, `http`, `https`.
        """
        return pulumi.get(self, "traffic_type")

    @traffic_type.setter
    def traffic_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_type", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class SpectrumApplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 argo_smart_routing: Optional[pulumi.Input[bool]] = None,
                 dns: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationDnsArgs']]] = None,
                 edge_ips: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationEdgeIpsArgs']]] = None,
                 ip_firewall: Optional[pulumi.Input[bool]] = None,
                 origin_directs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 origin_dns: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationOriginDnsArgs']]] = None,
                 origin_port: Optional[pulumi.Input[int]] = None,
                 origin_port_range: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationOriginPortRangeArgs']]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 proxy_protocol: Optional[pulumi.Input[str]] = None,
                 tls: Optional[pulumi.Input[str]] = None,
                 traffic_type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Spectrum Application. You can extend the power
        of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based
        services.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.SpectrumApplication("example",
            dns=cloudflare.SpectrumApplicationDnsArgs(
                name="ssh.example.com",
                type="CNAME",
            ),
            edge_ips=cloudflare.SpectrumApplicationEdgeIpsArgs(
                ips=[
                    "203.0.113.1",
                    "203.0.113.2",
                ],
                type="static",
            ),
            origin_directs=["tcp://192.0.2.1:22"],
            protocol="tcp/22",
            traffic_type="direct",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example <zone_id>/<spectrum_application_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] argo_smart_routing: Enables Argo Smart Routing.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationDnsArgs']] dns: The name and type of DNS record for the Spectrum application.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationEdgeIpsArgs']] edge_ips: The anycast edge IP configuration for the hostname of this application.
        :param pulumi.Input[bool] ip_firewall: Enables the IP Firewall for this application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] origin_directs: A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationOriginDnsArgs']] origin_dns: A destination DNS addresses to the origin.
        :param pulumi.Input[int] origin_port: Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationOriginPortRangeArgs']] origin_port_range: Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        :param pulumi.Input[str] protocol: The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        :param pulumi.Input[str] proxy_protocol: Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        :param pulumi.Input[str] tls: TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        :param pulumi.Input[str] traffic_type: Sets application type. Available values: `direct`, `http`, `https`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpectrumApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Spectrum Application. You can extend the power
        of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based
        services.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.SpectrumApplication("example",
            dns=cloudflare.SpectrumApplicationDnsArgs(
                name="ssh.example.com",
                type="CNAME",
            ),
            edge_ips=cloudflare.SpectrumApplicationEdgeIpsArgs(
                ips=[
                    "203.0.113.1",
                    "203.0.113.2",
                ],
                type="static",
            ),
            origin_directs=["tcp://192.0.2.1:22"],
            protocol="tcp/22",
            traffic_type="direct",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example <zone_id>/<spectrum_application_id>
        ```

        :param str resource_name: The name of the resource.
        :param SpectrumApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpectrumApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 argo_smart_routing: Optional[pulumi.Input[bool]] = None,
                 dns: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationDnsArgs']]] = None,
                 edge_ips: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationEdgeIpsArgs']]] = None,
                 ip_firewall: Optional[pulumi.Input[bool]] = None,
                 origin_directs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 origin_dns: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationOriginDnsArgs']]] = None,
                 origin_port: Optional[pulumi.Input[int]] = None,
                 origin_port_range: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationOriginPortRangeArgs']]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 proxy_protocol: Optional[pulumi.Input[str]] = None,
                 tls: Optional[pulumi.Input[str]] = None,
                 traffic_type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpectrumApplicationArgs.__new__(SpectrumApplicationArgs)

            __props__.__dict__["argo_smart_routing"] = argo_smart_routing
            if dns is None and not opts.urn:
                raise TypeError("Missing required property 'dns'")
            __props__.__dict__["dns"] = dns
            __props__.__dict__["edge_ips"] = edge_ips
            __props__.__dict__["ip_firewall"] = ip_firewall
            __props__.__dict__["origin_directs"] = origin_directs
            __props__.__dict__["origin_dns"] = origin_dns
            __props__.__dict__["origin_port"] = origin_port
            __props__.__dict__["origin_port_range"] = origin_port_range
            if protocol is None and not opts.urn:
                raise TypeError("Missing required property 'protocol'")
            __props__.__dict__["protocol"] = protocol
            __props__.__dict__["proxy_protocol"] = proxy_protocol
            __props__.__dict__["tls"] = tls
            __props__.__dict__["traffic_type"] = traffic_type
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(SpectrumApplication, __self__).__init__(
            'cloudflare:index/spectrumApplication:SpectrumApplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            argo_smart_routing: Optional[pulumi.Input[bool]] = None,
            dns: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationDnsArgs']]] = None,
            edge_ips: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationEdgeIpsArgs']]] = None,
            ip_firewall: Optional[pulumi.Input[bool]] = None,
            origin_directs: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            origin_dns: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationOriginDnsArgs']]] = None,
            origin_port: Optional[pulumi.Input[int]] = None,
            origin_port_range: Optional[pulumi.Input[pulumi.InputType['SpectrumApplicationOriginPortRangeArgs']]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            proxy_protocol: Optional[pulumi.Input[str]] = None,
            tls: Optional[pulumi.Input[str]] = None,
            traffic_type: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'SpectrumApplication':
        """
        Get an existing SpectrumApplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] argo_smart_routing: Enables Argo Smart Routing.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationDnsArgs']] dns: The name and type of DNS record for the Spectrum application.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationEdgeIpsArgs']] edge_ips: The anycast edge IP configuration for the hostname of this application.
        :param pulumi.Input[bool] ip_firewall: Enables the IP Firewall for this application.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] origin_directs: A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationOriginDnsArgs']] origin_dns: A destination DNS addresses to the origin.
        :param pulumi.Input[int] origin_port: Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        :param pulumi.Input[pulumi.InputType['SpectrumApplicationOriginPortRangeArgs']] origin_port_range: Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        :param pulumi.Input[str] protocol: The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        :param pulumi.Input[str] proxy_protocol: Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        :param pulumi.Input[str] tls: TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        :param pulumi.Input[str] traffic_type: Sets application type. Available values: `direct`, `http`, `https`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpectrumApplicationState.__new__(_SpectrumApplicationState)

        __props__.__dict__["argo_smart_routing"] = argo_smart_routing
        __props__.__dict__["dns"] = dns
        __props__.__dict__["edge_ips"] = edge_ips
        __props__.__dict__["ip_firewall"] = ip_firewall
        __props__.__dict__["origin_directs"] = origin_directs
        __props__.__dict__["origin_dns"] = origin_dns
        __props__.__dict__["origin_port"] = origin_port
        __props__.__dict__["origin_port_range"] = origin_port_range
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["proxy_protocol"] = proxy_protocol
        __props__.__dict__["tls"] = tls
        __props__.__dict__["traffic_type"] = traffic_type
        __props__.__dict__["zone_id"] = zone_id
        return SpectrumApplication(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="argoSmartRouting")
    def argo_smart_routing(self) -> pulumi.Output[bool]:
        """
        Enables Argo Smart Routing.
        """
        return pulumi.get(self, "argo_smart_routing")

    @property
    @pulumi.getter
    def dns(self) -> pulumi.Output['outputs.SpectrumApplicationDns']:
        """
        The name and type of DNS record for the Spectrum application.
        """
        return pulumi.get(self, "dns")

    @property
    @pulumi.getter(name="edgeIps")
    def edge_ips(self) -> pulumi.Output['outputs.SpectrumApplicationEdgeIps']:
        """
        The anycast edge IP configuration for the hostname of this application.
        """
        return pulumi.get(self, "edge_ips")

    @property
    @pulumi.getter(name="ipFirewall")
    def ip_firewall(self) -> pulumi.Output[bool]:
        """
        Enables the IP Firewall for this application.
        """
        return pulumi.get(self, "ip_firewall")

    @property
    @pulumi.getter(name="originDirects")
    def origin_directs(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        """
        return pulumi.get(self, "origin_directs")

    @property
    @pulumi.getter(name="originDns")
    def origin_dns(self) -> pulumi.Output[Optional['outputs.SpectrumApplicationOriginDns']]:
        """
        A destination DNS addresses to the origin.
        """
        return pulumi.get(self, "origin_dns")

    @property
    @pulumi.getter(name="originPort")
    def origin_port(self) -> pulumi.Output[Optional[int]]:
        """
        Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        """
        return pulumi.get(self, "origin_port")

    @property
    @pulumi.getter(name="originPortRange")
    def origin_port_range(self) -> pulumi.Output[Optional['outputs.SpectrumApplicationOriginPortRange']]:
        """
        Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        """
        return pulumi.get(self, "origin_port_range")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[str]:
        """
        The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="proxyProtocol")
    def proxy_protocol(self) -> pulumi.Output[str]:
        """
        Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        """
        return pulumi.get(self, "proxy_protocol")

    @property
    @pulumi.getter
    def tls(self) -> pulumi.Output[str]:
        """
        TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        """
        return pulumi.get(self, "tls")

    @property
    @pulumi.getter(name="trafficType")
    def traffic_type(self) -> pulumi.Output[str]:
        """
        Sets application type. Available values: `direct`, `http`, `https`.
        """
        return pulumi.get(self, "traffic_type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")


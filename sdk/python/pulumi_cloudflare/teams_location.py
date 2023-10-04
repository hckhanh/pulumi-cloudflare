# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TeamsLocationArgs', 'TeamsLocation']

@pulumi.input_type
class TeamsLocationArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 client_default: Optional[pulumi.Input[bool]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]] = None):
        """
        The set of arguments for constructing a TeamsLocation resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: Name of the teams location.
        :param pulumi.Input[bool] client_default: Indicator that this is the default location.
        :param pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]] networks: The networks CIDRs that comprise the location.
        """
        TeamsLocationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            name=name,
            client_default=client_default,
            networks=networks,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: pulumi.Input[str],
             name: pulumi.Input[str],
             client_default: Optional[pulumi.Input[bool]] = None,
             networks: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("account_id", account_id)
        _setter("name", name)
        if client_default is not None:
            _setter("client_default", client_default)
        if networks is not None:
            _setter("networks", networks)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the teams location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicator that this is the default location.
        """
        return pulumi.get(self, "client_default")

    @client_default.setter
    def client_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "client_default", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]:
        """
        The networks CIDRs that comprise the location.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]):
        pulumi.set(self, "networks", value)


@pulumi.input_type
class _TeamsLocationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 anonymized_logs_enabled: Optional[pulumi.Input[bool]] = None,
                 client_default: Optional[pulumi.Input[bool]] = None,
                 doh_subdomain: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 ipv4_destination: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]] = None,
                 policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering TeamsLocation resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[bool] anonymized_logs_enabled: Indicator that anonymized logs are enabled.
        :param pulumi.Input[bool] client_default: Indicator that this is the default location.
        :param pulumi.Input[str] doh_subdomain: The FQDN that DoH clients should be pointed at.
        :param pulumi.Input[str] ip: Client IP address.
        :param pulumi.Input[str] ipv4_destination: IP to direct all IPv4 DNS queries to.
        :param pulumi.Input[str] name: Name of the teams location.
        :param pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]] networks: The networks CIDRs that comprise the location.
        """
        _TeamsLocationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            anonymized_logs_enabled=anonymized_logs_enabled,
            client_default=client_default,
            doh_subdomain=doh_subdomain,
            ip=ip,
            ipv4_destination=ipv4_destination,
            name=name,
            networks=networks,
            policy_ids=policy_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             anonymized_logs_enabled: Optional[pulumi.Input[bool]] = None,
             client_default: Optional[pulumi.Input[bool]] = None,
             doh_subdomain: Optional[pulumi.Input[str]] = None,
             ip: Optional[pulumi.Input[str]] = None,
             ipv4_destination: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             networks: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]] = None,
             policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if account_id is not None:
            _setter("account_id", account_id)
        if anonymized_logs_enabled is not None:
            _setter("anonymized_logs_enabled", anonymized_logs_enabled)
        if client_default is not None:
            _setter("client_default", client_default)
        if doh_subdomain is not None:
            _setter("doh_subdomain", doh_subdomain)
        if ip is not None:
            _setter("ip", ip)
        if ipv4_destination is not None:
            _setter("ipv4_destination", ipv4_destination)
        if name is not None:
            _setter("name", name)
        if networks is not None:
            _setter("networks", networks)
        if policy_ids is not None:
            _setter("policy_ids", policy_ids)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="anonymizedLogsEnabled")
    def anonymized_logs_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicator that anonymized logs are enabled.
        """
        return pulumi.get(self, "anonymized_logs_enabled")

    @anonymized_logs_enabled.setter
    def anonymized_logs_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "anonymized_logs_enabled", value)

    @property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicator that this is the default location.
        """
        return pulumi.get(self, "client_default")

    @client_default.setter
    def client_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "client_default", value)

    @property
    @pulumi.getter(name="dohSubdomain")
    def doh_subdomain(self) -> Optional[pulumi.Input[str]]:
        """
        The FQDN that DoH clients should be pointed at.
        """
        return pulumi.get(self, "doh_subdomain")

    @doh_subdomain.setter
    def doh_subdomain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "doh_subdomain", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        Client IP address.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="ipv4Destination")
    def ipv4_destination(self) -> Optional[pulumi.Input[str]]:
        """
        IP to direct all IPv4 DNS queries to.
        """
        return pulumi.get(self, "ipv4_destination")

    @ipv4_destination.setter
    def ipv4_destination(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv4_destination", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the teams location.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]:
        """
        The networks CIDRs that comprise the location.
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamsLocationNetworkArgs']]]]):
        pulumi.set(self, "networks", value)

    @property
    @pulumi.getter(name="policyIds")
    def policy_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "policy_ids")

    @policy_ids.setter
    def policy_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "policy_ids", value)


class TeamsLocation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 client_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamsLocationNetworkArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Teams Location resource. Teams Locations are
        referenced when creating secure web gateway policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.TeamsLocation("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            client_default=True,
            name="office",
            networks=[
                cloudflare.TeamsLocationNetworkArgs(
                    network="203.0.113.1/32",
                ),
                cloudflare.TeamsLocationNetworkArgs(
                    network="203.0.113.2/32",
                ),
            ])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example <account_id>/<teams_location_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[bool] client_default: Indicator that this is the default location.
        :param pulumi.Input[str] name: Name of the teams location.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamsLocationNetworkArgs']]]] networks: The networks CIDRs that comprise the location.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamsLocationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Teams Location resource. Teams Locations are
        referenced when creating secure web gateway policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.TeamsLocation("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            client_default=True,
            name="office",
            networks=[
                cloudflare.TeamsLocationNetworkArgs(
                    network="203.0.113.1/32",
                ),
                cloudflare.TeamsLocationNetworkArgs(
                    network="203.0.113.2/32",
                ),
            ])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example <account_id>/<teams_location_id>
        ```

        :param str resource_name: The name of the resource.
        :param TeamsLocationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamsLocationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TeamsLocationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 client_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamsLocationNetworkArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamsLocationArgs.__new__(TeamsLocationArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["client_default"] = client_default
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["networks"] = networks
            __props__.__dict__["anonymized_logs_enabled"] = None
            __props__.__dict__["doh_subdomain"] = None
            __props__.__dict__["ip"] = None
            __props__.__dict__["ipv4_destination"] = None
            __props__.__dict__["policy_ids"] = None
        super(TeamsLocation, __self__).__init__(
            'cloudflare:index/teamsLocation:TeamsLocation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            anonymized_logs_enabled: Optional[pulumi.Input[bool]] = None,
            client_default: Optional[pulumi.Input[bool]] = None,
            doh_subdomain: Optional[pulumi.Input[str]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            ipv4_destination: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamsLocationNetworkArgs']]]]] = None,
            policy_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'TeamsLocation':
        """
        Get an existing TeamsLocation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[bool] anonymized_logs_enabled: Indicator that anonymized logs are enabled.
        :param pulumi.Input[bool] client_default: Indicator that this is the default location.
        :param pulumi.Input[str] doh_subdomain: The FQDN that DoH clients should be pointed at.
        :param pulumi.Input[str] ip: Client IP address.
        :param pulumi.Input[str] ipv4_destination: IP to direct all IPv4 DNS queries to.
        :param pulumi.Input[str] name: Name of the teams location.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamsLocationNetworkArgs']]]] networks: The networks CIDRs that comprise the location.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamsLocationState.__new__(_TeamsLocationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["anonymized_logs_enabled"] = anonymized_logs_enabled
        __props__.__dict__["client_default"] = client_default
        __props__.__dict__["doh_subdomain"] = doh_subdomain
        __props__.__dict__["ip"] = ip
        __props__.__dict__["ipv4_destination"] = ipv4_destination
        __props__.__dict__["name"] = name
        __props__.__dict__["networks"] = networks
        __props__.__dict__["policy_ids"] = policy_ids
        return TeamsLocation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="anonymizedLogsEnabled")
    def anonymized_logs_enabled(self) -> pulumi.Output[bool]:
        """
        Indicator that anonymized logs are enabled.
        """
        return pulumi.get(self, "anonymized_logs_enabled")

    @property
    @pulumi.getter(name="clientDefault")
    def client_default(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicator that this is the default location.
        """
        return pulumi.get(self, "client_default")

    @property
    @pulumi.getter(name="dohSubdomain")
    def doh_subdomain(self) -> pulumi.Output[str]:
        """
        The FQDN that DoH clients should be pointed at.
        """
        return pulumi.get(self, "doh_subdomain")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        """
        Client IP address.
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="ipv4Destination")
    def ipv4_destination(self) -> pulumi.Output[str]:
        """
        IP to direct all IPv4 DNS queries to.
        """
        return pulumi.get(self, "ipv4_destination")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the teams location.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.TeamsLocationNetwork']]]:
        """
        The networks CIDRs that comprise the location.
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="policyIds")
    def policy_ids(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "policy_ids")


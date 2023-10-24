# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['StaticRouteArgs', 'StaticRoute']

@pulumi.input_type
class StaticRouteArgs:
    def __init__(__self__, *,
                 nexthop: pulumi.Input[str],
                 prefix: pulumi.Input[str],
                 priority: pulumi.Input[int],
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a StaticRoute resource.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        StaticRouteArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            nexthop=nexthop,
            prefix=prefix,
            priority=priority,
            account_id=account_id,
            colo_names=colo_names,
            colo_regions=colo_regions,
            description=description,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             nexthop: Optional[pulumi.Input[str]] = None,
             prefix: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             account_id: Optional[pulumi.Input[str]] = None,
             colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             weight: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if nexthop is None:
            raise TypeError("Missing 'nexthop' argument")
        if prefix is None:
            raise TypeError("Missing 'prefix' argument")
        if priority is None:
            raise TypeError("Missing 'priority' argument")
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if colo_names is None and 'coloNames' in kwargs:
            colo_names = kwargs['coloNames']
        if colo_regions is None and 'coloRegions' in kwargs:
            colo_regions = kwargs['coloRegions']

        _setter("nexthop", nexthop)
        _setter("prefix", prefix)
        _setter("priority", priority)
        if account_id is not None:
            _setter("account_id", account_id)
        if colo_names is not None:
            _setter("colo_names", colo_names)
        if colo_regions is not None:
            _setter("colo_regions", colo_regions)
        if description is not None:
            _setter("description", description)
        if weight is not None:
            _setter("weight", weight)

    @property
    @pulumi.getter
    def nexthop(self) -> pulumi.Input[str]:
        """
        The nexthop IP address where traffic will be routed to.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: pulumi.Input[str]):
        pulumi.set(self, "nexthop", value)

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Input[str]:
        """
        Your network prefix using CIDR notation.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: pulumi.Input[str]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The priority for the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="coloNames")
    def colo_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation regions for this static route.
        """
        return pulumi.get(self, "colo_names")

    @colo_names.setter
    def colo_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_names", value)

    @property
    @pulumi.getter(name="coloRegions")
    def colo_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation names for this static route.
        """
        return pulumi.get(self, "colo_regions")

    @colo_regions.setter
    def colo_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_regions", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _StaticRouteState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nexthop: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering StaticRoute resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        _StaticRouteState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            colo_names=colo_names,
            colo_regions=colo_regions,
            description=description,
            nexthop=nexthop,
            prefix=prefix,
            priority=priority,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             nexthop: Optional[pulumi.Input[str]] = None,
             prefix: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             weight: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if colo_names is None and 'coloNames' in kwargs:
            colo_names = kwargs['coloNames']
        if colo_regions is None and 'coloRegions' in kwargs:
            colo_regions = kwargs['coloRegions']

        if account_id is not None:
            _setter("account_id", account_id)
        if colo_names is not None:
            _setter("colo_names", colo_names)
        if colo_regions is not None:
            _setter("colo_regions", colo_regions)
        if description is not None:
            _setter("description", description)
        if nexthop is not None:
            _setter("nexthop", nexthop)
        if prefix is not None:
            _setter("prefix", prefix)
        if priority is not None:
            _setter("priority", priority)
        if weight is not None:
            _setter("weight", weight)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="coloNames")
    def colo_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation regions for this static route.
        """
        return pulumi.get(self, "colo_names")

    @colo_names.setter
    def colo_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_names", value)

    @property
    @pulumi.getter(name="coloRegions")
    def colo_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation names for this static route.
        """
        return pulumi.get(self, "colo_regions")

    @colo_regions.setter
    def colo_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_regions", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def nexthop(self) -> Optional[pulumi.Input[str]]:
        """
        The nexthop IP address where traffic will be routed to.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nexthop", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Your network prefix using CIDR notation.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority for the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class StaticRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nexthop: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a resource, that manages Cloudflare static routes for Magic
        Transit or Magic WAN. Static routes are used to route traffic
        through GRE tunnels.

        ## Import

        ```sh
         $ pulumi import cloudflare:index/staticRoute:StaticRoute example <account_id>/<static_route_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StaticRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource, that manages Cloudflare static routes for Magic
        Transit or Magic WAN. Static routes are used to route traffic
        through GRE tunnels.

        ## Import

        ```sh
         $ pulumi import cloudflare:index/staticRoute:StaticRoute example <account_id>/<static_route_id>
        ```

        :param str resource_name: The name of the resource.
        :param StaticRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StaticRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            StaticRouteArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nexthop: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StaticRouteArgs.__new__(StaticRouteArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["colo_names"] = colo_names
            __props__.__dict__["colo_regions"] = colo_regions
            __props__.__dict__["description"] = description
            if nexthop is None and not opts.urn:
                raise TypeError("Missing required property 'nexthop'")
            __props__.__dict__["nexthop"] = nexthop
            if prefix is None and not opts.urn:
                raise TypeError("Missing required property 'prefix'")
            __props__.__dict__["prefix"] = prefix
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            __props__.__dict__["weight"] = weight
        super(StaticRoute, __self__).__init__(
            'cloudflare:index/staticRoute:StaticRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            nexthop: Optional[pulumi.Input[str]] = None,
            prefix: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'StaticRoute':
        """
        Get an existing StaticRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StaticRouteState.__new__(_StaticRouteState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["colo_names"] = colo_names
        __props__.__dict__["colo_regions"] = colo_regions
        __props__.__dict__["description"] = description
        __props__.__dict__["nexthop"] = nexthop
        __props__.__dict__["prefix"] = prefix
        __props__.__dict__["priority"] = priority
        __props__.__dict__["weight"] = weight
        return StaticRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="coloNames")
    def colo_names(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Cloudflare colocation regions for this static route.
        """
        return pulumi.get(self, "colo_names")

    @property
    @pulumi.getter(name="coloRegions")
    def colo_regions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Cloudflare colocation names for this static route.
        """
        return pulumi.get(self, "colo_regions")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the static route.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def nexthop(self) -> pulumi.Output[str]:
        """
        The nexthop IP address where traffic will be routed to.
        """
        return pulumi.get(self, "nexthop")

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[str]:
        """
        Your network prefix using CIDR notation.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The priority for the static route.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[int]]:
        """
        The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "weight")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TieredCacheArgs', 'TieredCache']

@pulumi.input_type
class TieredCacheArgs:
    def __init__(__self__, *,
                 cache_type: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a TieredCache resource.
        :param pulumi.Input[str] cache_type: The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        TieredCacheArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cache_type=cache_type,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cache_type: pulumi.Input[str],
             zone_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("cache_type", cache_type)
        _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="cacheType")
    def cache_type(self) -> pulumi.Input[str]:
        """
        The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        """
        return pulumi.get(self, "cache_type")

    @cache_type.setter
    def cache_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "cache_type", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _TieredCacheState:
    def __init__(__self__, *,
                 cache_type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TieredCache resources.
        :param pulumi.Input[str] cache_type: The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _TieredCacheState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cache_type=cache_type,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cache_type: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if cache_type is not None:
            _setter("cache_type", cache_type)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="cacheType")
    def cache_type(self) -> Optional[pulumi.Input[str]]:
        """
        The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        """
        return pulumi.get(self, "cache_type")

    @cache_type.setter
    def cache_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cache_type", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class TieredCache(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cache_type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource, that manages Cloudflare Tiered Cache settings.
        This allows you to adjust topologies for your zone.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.TieredCache("example",
            cache_type="smart",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cache_type: The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TieredCacheArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource, that manages Cloudflare Tiered Cache settings.
        This allows you to adjust topologies for your zone.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.TieredCache("example",
            cache_type="smart",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param TieredCacheArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TieredCacheArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TieredCacheArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cache_type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TieredCacheArgs.__new__(TieredCacheArgs)

            if cache_type is None and not opts.urn:
                raise TypeError("Missing required property 'cache_type'")
            __props__.__dict__["cache_type"] = cache_type
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(TieredCache, __self__).__init__(
            'cloudflare:index/tieredCache:TieredCache',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cache_type: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'TieredCache':
        """
        Get an existing TieredCache resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cache_type: The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TieredCacheState.__new__(_TieredCacheState)

        __props__.__dict__["cache_type"] = cache_type
        __props__.__dict__["zone_id"] = zone_id
        return TieredCache(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cacheType")
    def cache_type(self) -> pulumi.Output[str]:
        """
        The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        """
        return pulumi.get(self, "cache_type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")


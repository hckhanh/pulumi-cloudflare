# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ZoneDnssecArgs', 'ZoneDnssec']

@pulumi.input_type
class ZoneDnssecArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 modified_on: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ZoneDnssec resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] modified_on: Zone DNSSEC updated time.
        """
        ZoneDnssecArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            zone_id=zone_id,
            modified_on=modified_on,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             zone_id: pulumi.Input[str],
             modified_on: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("zone_id", zone_id)
        if modified_on is not None:
            _setter("modified_on", modified_on)

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

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[str]]:
        """
        Zone DNSSEC updated time.
        """
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_on", value)


@pulumi.input_type
class _ZoneDnssecState:
    def __init__(__self__, *,
                 algorithm: Optional[pulumi.Input[str]] = None,
                 digest: Optional[pulumi.Input[str]] = None,
                 digest_algorithm: Optional[pulumi.Input[str]] = None,
                 digest_type: Optional[pulumi.Input[str]] = None,
                 ds: Optional[pulumi.Input[str]] = None,
                 flags: Optional[pulumi.Input[int]] = None,
                 key_tag: Optional[pulumi.Input[int]] = None,
                 key_type: Optional[pulumi.Input[str]] = None,
                 modified_on: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZoneDnssec resources.
        :param pulumi.Input[str] algorithm: Zone DNSSEC algorithm.
        :param pulumi.Input[str] digest: Zone DNSSEC digest.
        :param pulumi.Input[str] digest_algorithm: Digest algorithm use for Zone DNSSEC.
        :param pulumi.Input[str] digest_type: Digest Type for Zone DNSSEC.
        :param pulumi.Input[str] ds: DS for the Zone DNSSEC.
        :param pulumi.Input[int] flags: Zone DNSSEC flags.
        :param pulumi.Input[int] key_tag: Key Tag for the Zone DNSSEC.
        :param pulumi.Input[str] key_type: Key type used for Zone DNSSEC.
        :param pulumi.Input[str] modified_on: Zone DNSSEC updated time.
        :param pulumi.Input[str] public_key: Public Key for the Zone DNSSEC.
        :param pulumi.Input[str] status: The status of the Zone DNSSEC.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _ZoneDnssecState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            algorithm=algorithm,
            digest=digest,
            digest_algorithm=digest_algorithm,
            digest_type=digest_type,
            ds=ds,
            flags=flags,
            key_tag=key_tag,
            key_type=key_type,
            modified_on=modified_on,
            public_key=public_key,
            status=status,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             algorithm: Optional[pulumi.Input[str]] = None,
             digest: Optional[pulumi.Input[str]] = None,
             digest_algorithm: Optional[pulumi.Input[str]] = None,
             digest_type: Optional[pulumi.Input[str]] = None,
             ds: Optional[pulumi.Input[str]] = None,
             flags: Optional[pulumi.Input[int]] = None,
             key_tag: Optional[pulumi.Input[int]] = None,
             key_type: Optional[pulumi.Input[str]] = None,
             modified_on: Optional[pulumi.Input[str]] = None,
             public_key: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if algorithm is not None:
            _setter("algorithm", algorithm)
        if digest is not None:
            _setter("digest", digest)
        if digest_algorithm is not None:
            _setter("digest_algorithm", digest_algorithm)
        if digest_type is not None:
            _setter("digest_type", digest_type)
        if ds is not None:
            _setter("ds", ds)
        if flags is not None:
            _setter("flags", flags)
        if key_tag is not None:
            _setter("key_tag", key_tag)
        if key_type is not None:
            _setter("key_type", key_type)
        if modified_on is not None:
            _setter("modified_on", modified_on)
        if public_key is not None:
            _setter("public_key", public_key)
        if status is not None:
            _setter("status", status)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Zone DNSSEC algorithm.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter
    def digest(self) -> Optional[pulumi.Input[str]]:
        """
        Zone DNSSEC digest.
        """
        return pulumi.get(self, "digest")

    @digest.setter
    def digest(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest", value)

    @property
    @pulumi.getter(name="digestAlgorithm")
    def digest_algorithm(self) -> Optional[pulumi.Input[str]]:
        """
        Digest algorithm use for Zone DNSSEC.
        """
        return pulumi.get(self, "digest_algorithm")

    @digest_algorithm.setter
    def digest_algorithm(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest_algorithm", value)

    @property
    @pulumi.getter(name="digestType")
    def digest_type(self) -> Optional[pulumi.Input[str]]:
        """
        Digest Type for Zone DNSSEC.
        """
        return pulumi.get(self, "digest_type")

    @digest_type.setter
    def digest_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest_type", value)

    @property
    @pulumi.getter
    def ds(self) -> Optional[pulumi.Input[str]]:
        """
        DS for the Zone DNSSEC.
        """
        return pulumi.get(self, "ds")

    @ds.setter
    def ds(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ds", value)

    @property
    @pulumi.getter
    def flags(self) -> Optional[pulumi.Input[int]]:
        """
        Zone DNSSEC flags.
        """
        return pulumi.get(self, "flags")

    @flags.setter
    def flags(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "flags", value)

    @property
    @pulumi.getter(name="keyTag")
    def key_tag(self) -> Optional[pulumi.Input[int]]:
        """
        Key Tag for the Zone DNSSEC.
        """
        return pulumi.get(self, "key_tag")

    @key_tag.setter
    def key_tag(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_tag", value)

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> Optional[pulumi.Input[str]]:
        """
        Key type used for Zone DNSSEC.
        """
        return pulumi.get(self, "key_type")

    @key_type.setter
    def key_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_type", value)

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[str]]:
        """
        Zone DNSSEC updated time.
        """
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_on", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> Optional[pulumi.Input[str]]:
        """
        Public Key for the Zone DNSSEC.
        """
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Zone DNSSEC.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

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


class ZoneDnssec(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 modified_on: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare resource to create and modify zone DNSSEC settings.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zone = cloudflare.Zone("exampleZone", zone="example.com")
        example_zone_dnssec = cloudflare.ZoneDnssec("exampleZoneDnssec", zone_id=example_zone.id)
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] modified_on: Zone DNSSEC updated time.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneDnssecArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare resource to create and modify zone DNSSEC settings.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_zone = cloudflare.Zone("exampleZone", zone="example.com")
        example_zone_dnssec = cloudflare.ZoneDnssec("exampleZoneDnssec", zone_id=example_zone.id)
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param ZoneDnssecArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneDnssecArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ZoneDnssecArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 modified_on: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZoneDnssecArgs.__new__(ZoneDnssecArgs)

            __props__.__dict__["modified_on"] = modified_on
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["algorithm"] = None
            __props__.__dict__["digest"] = None
            __props__.__dict__["digest_algorithm"] = None
            __props__.__dict__["digest_type"] = None
            __props__.__dict__["ds"] = None
            __props__.__dict__["flags"] = None
            __props__.__dict__["key_tag"] = None
            __props__.__dict__["key_type"] = None
            __props__.__dict__["public_key"] = None
            __props__.__dict__["status"] = None
        super(ZoneDnssec, __self__).__init__(
            'cloudflare:index/zoneDnssec:ZoneDnssec',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            algorithm: Optional[pulumi.Input[str]] = None,
            digest: Optional[pulumi.Input[str]] = None,
            digest_algorithm: Optional[pulumi.Input[str]] = None,
            digest_type: Optional[pulumi.Input[str]] = None,
            ds: Optional[pulumi.Input[str]] = None,
            flags: Optional[pulumi.Input[int]] = None,
            key_tag: Optional[pulumi.Input[int]] = None,
            key_type: Optional[pulumi.Input[str]] = None,
            modified_on: Optional[pulumi.Input[str]] = None,
            public_key: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ZoneDnssec':
        """
        Get an existing ZoneDnssec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] algorithm: Zone DNSSEC algorithm.
        :param pulumi.Input[str] digest: Zone DNSSEC digest.
        :param pulumi.Input[str] digest_algorithm: Digest algorithm use for Zone DNSSEC.
        :param pulumi.Input[str] digest_type: Digest Type for Zone DNSSEC.
        :param pulumi.Input[str] ds: DS for the Zone DNSSEC.
        :param pulumi.Input[int] flags: Zone DNSSEC flags.
        :param pulumi.Input[int] key_tag: Key Tag for the Zone DNSSEC.
        :param pulumi.Input[str] key_type: Key type used for Zone DNSSEC.
        :param pulumi.Input[str] modified_on: Zone DNSSEC updated time.
        :param pulumi.Input[str] public_key: Public Key for the Zone DNSSEC.
        :param pulumi.Input[str] status: The status of the Zone DNSSEC.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZoneDnssecState.__new__(_ZoneDnssecState)

        __props__.__dict__["algorithm"] = algorithm
        __props__.__dict__["digest"] = digest
        __props__.__dict__["digest_algorithm"] = digest_algorithm
        __props__.__dict__["digest_type"] = digest_type
        __props__.__dict__["ds"] = ds
        __props__.__dict__["flags"] = flags
        __props__.__dict__["key_tag"] = key_tag
        __props__.__dict__["key_type"] = key_type
        __props__.__dict__["modified_on"] = modified_on
        __props__.__dict__["public_key"] = public_key
        __props__.__dict__["status"] = status
        __props__.__dict__["zone_id"] = zone_id
        return ZoneDnssec(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def algorithm(self) -> pulumi.Output[str]:
        """
        Zone DNSSEC algorithm.
        """
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def digest(self) -> pulumi.Output[str]:
        """
        Zone DNSSEC digest.
        """
        return pulumi.get(self, "digest")

    @property
    @pulumi.getter(name="digestAlgorithm")
    def digest_algorithm(self) -> pulumi.Output[str]:
        """
        Digest algorithm use for Zone DNSSEC.
        """
        return pulumi.get(self, "digest_algorithm")

    @property
    @pulumi.getter(name="digestType")
    def digest_type(self) -> pulumi.Output[str]:
        """
        Digest Type for Zone DNSSEC.
        """
        return pulumi.get(self, "digest_type")

    @property
    @pulumi.getter
    def ds(self) -> pulumi.Output[str]:
        """
        DS for the Zone DNSSEC.
        """
        return pulumi.get(self, "ds")

    @property
    @pulumi.getter
    def flags(self) -> pulumi.Output[int]:
        """
        Zone DNSSEC flags.
        """
        return pulumi.get(self, "flags")

    @property
    @pulumi.getter(name="keyTag")
    def key_tag(self) -> pulumi.Output[int]:
        """
        Key Tag for the Zone DNSSEC.
        """
        return pulumi.get(self, "key_tag")

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Output[str]:
        """
        Key type used for Zone DNSSEC.
        """
        return pulumi.get(self, "key_type")

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[str]:
        """
        Zone DNSSEC updated time.
        """
        return pulumi.get(self, "modified_on")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Output[str]:
        """
        Public Key for the Zone DNSSEC.
        """
        return pulumi.get(self, "public_key")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Zone DNSSEC.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

